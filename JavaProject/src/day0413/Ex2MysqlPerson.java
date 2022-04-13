package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex2MysqlPerson {
	static final String DRIVER="com.mysql.cj.jdbc.Driver";
	static final String URL="jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul";
	
	Scanner sc=new Scanner(System.in);
	
	public Ex2MysqlPerson() {
		try {
			Class.forName(DRIVER);
//			System.out.println("mysql����̹� ����");
		} catch(ClassNotFoundException e) {
			System.out.println("mysql ����̹� ����:"+e.getMessage());
		}
	}
	
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, "root", "0000");
//			System.out.println("mysql ���� ����!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("mysql ���� ����!:"+e.getMessage());
		}
		return conn;
	}
	
	public void personInsert() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="";
		//�ʿ��� ������ �Է�
		System.out.print("�̸� �Է�: ");
		String name=sc.nextLine();
		System.out.print("������ �Է�: ");
		String blood=sc.nextLine();
		System.out.print("���� �Է�: ");
		int age=Integer.parseInt(sc.nextLine());
		
		//db����
		conn=this.getConnection();
		sql="insert into person (name,blood,age,writeday) values (?,?,?,now())";
		
		try {
			//sql�˻�
			pstmt=conn.prepareStatement(sql);
			//? ������ŭ �ݵ�� ���ε�: ?�� 1������ ����
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);
			
			//����
			pstmt.execute();
			System.out.println("�߰��Ǿ����ϴ�!");
			System.out.println();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close(); 
			}catch(SQLException e) {
				
			}
		}
		
	}
	
	public void personAllWrite() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from person order by name";
		
		//db����
		conn=this.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println();
			System.out.println("\t**Person DB ���**");
			System.out.println();
			System.out.println("��ȣ\t�̸�\t������\t����\t�ۼ���");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
			while(rs.next()) {
				String num = rs.getString("num");
				String name=rs.getString("name");
				String blood=rs.getString("blood").toUpperCase();//�빮�ڷ� ��ȯ
				int age=rs.getInt("age");
				Timestamp ts=rs.getTimestamp("writeday");
				System.out.println(num+"\t"+name+"\t"+blood+"\t"+
				age+"\t"+sdf.format(ts));
			}
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				
			}
		}
	}
	
	public void personDelete() {
		//�̸��� �Է��� �ش� ������ ����
		//���� �� "�����Ǿ����ϴ�"�޼��� ���
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="";
		System.out.println();
		System.out.print("������ �̸��� �Է��ϼ���: ");
		String name=sc.nextLine();
		
		//db����
		conn=this.getConnection();
		sql="delete from person where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.execute();
			System.out.println(name+"���� ������ �����Ǿ����ϴ�.");
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void personBloodGroup() {
		//�������� �ο����� ��� ���� ���(group by)
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs= null;
		String sql="select blood, count(*), avg(age) from person group by blood order by 1";
		
		conn=this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println();
			System.out.println("-----------�������� �ο��� �� ��ճ���------------");
			System.out.println();
			System.out.println("������\t�ο���\t��ճ���");
			while(rs.next()) {
				String blood=rs.getString("blood").toUpperCase();
				String inwon=rs.getString("count(*)");
				int age=rs.getInt("avg(age)");
				System.out.println(blood+"\t"+inwon+"\t"+age);
			}
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	public int getMenu() {
		
		System.out.println("**�޴� ����");
		System.out.print("1.�߰� 2.��ü��� 3.���� 4.�м� 5.���� \n>>");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2MysqlPerson ex=new Ex2MysqlPerson();
		
		while(true) {
			int n=ex.getMenu();
			switch(n) {
			case 1:
				ex.personInsert();
				break;
			case 2:
				ex.personAllWrite();
				break;
			case 3:
				ex.personDelete();
				break;
			case 4:
				ex.personBloodGroup();
				break;
			default:
				System.out.println("**���α׷� ����!1");
				System.exit(0);
			}
			
			
				
		}
	}

}
