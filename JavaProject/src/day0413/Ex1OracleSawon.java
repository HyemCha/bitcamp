package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex1OracleSawon {
	static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	
	Scanner sc=new Scanner(System.in);
	public Ex1OracleSawon() {
		try {
			Class.forName(DRIVER);
			System.out.println("����Ŭ ����̹� ����!");
		} catch(ClassNotFoundException e){
			System.out.println("����Ŭ ����̹� ����!:"+e.getMessage());
		}
		
	}
	public int getMenu() {
		System.out.println("**�޴� ����**");
		System.out.println("1. ����߰� 2. ��ü������ 3. ����");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	//db ������ �����ϴ� �޼��� 
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, "bit901", "a1234");
			System.out.println("db���� ����!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db���� ����:"+e.getMessage());
		}
		return conn;
	}
	public void sawonInsert() {
		Connection conn=this.getConnection();
		Statement stmt=null;
		System.out.print("�̸�");
		String name=sc.nextLine();
		System.out.print("�μ���(ȫ����, �λ��, ������):");
		String buseo=sc.nextLine();
		System.out.print("�⺻��:");
		int gibon=Integer.parseInt(sc.nextLine());
		System.out.print("����:");
		int sudang=Integer.parseInt(sc.nextLine());
		
		String sql="insert into sawon values (seq_bit.nextval, '"
		+name+"','"+buseo+"',"+gibon+","+sudang+",sysdate)";
		
		try {
			stmt=conn.createStatement();
			//sql���� ����
			stmt.execute(sql);
			
			System.out.println("DB�� �����Ͱ� �߰��ƾ��!!");
		} catch(SQLException e) {
			System.out.println("insert ����:"+e.getMessage());
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				
			}
		}
	}
	public void sawonAllWrite() {
		Connection conn=this.getConnection();
		
		Statement stmt=null;
		ResultSet rs=null;
		String sql="select * from sawon order by name";//�̸���
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//����
			System.out.println("��ȣ\t�����\t�μ���\t�⺻��\t����\t�ѱ޿�\t�����");
			while(rs.next()) {
//				int num = rs.getInt(1);
//				String name=rs.getString(2);
//				String buseo=rs.getString(3);
//				int gibon=rs.getInt(4);
//				int sudang=rs.getInt(5);
//				int total=gibon+sudang;
//				Timestamp ts=rs.getTimestamp(6);
				
				//�÷������� ��������
				int num = rs.getInt("num");
				String name=rs.getString("name");
				String buseo=rs.getString("buseo");
				int gibon=rs.getInt("gibon");
				int sudang=rs.getInt("sudang");
				int total=gibon+sudang;
				Timestamp ts=rs.getTimestamp("writeday");
				
				//��¥�� ���ڿ��� ��ȯ
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy=MM=dd HH:mm");
				System.out.println(num+"\t"+name+"\t"+buseo+"\t"+
				gibon+"\t"+sudang+"\t"+total+"\t"+sdf.format(ts));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1OracleSawon ex  = new Ex1OracleSawon();
		while(true) {
			int n=ex.getMenu();
			switch(n) {
			case 1:
				ex.sawonInsert();
				break;
			case 2:
				ex.sawonAllWrite();
				break;
			default:
				System.out.println("���α׷� ����!!");
				System.exit(0);
			}
		}
	}

}
