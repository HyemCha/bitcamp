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
//			System.out.println("mysql드라이버 성공");
		} catch(ClassNotFoundException e) {
			System.out.println("mysql 드라이버 실패:"+e.getMessage());
		}
	}
	
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, "root", "0000");
//			System.out.println("mysql 접근 성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("mysql 접근 실패!:"+e.getMessage());
		}
		return conn;
	}
	
	public void personInsert() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="";
		//필요한 데이터 입력
		System.out.print("이름 입력: ");
		String name=sc.nextLine();
		System.out.print("혈액형 입력: ");
		String blood=sc.nextLine();
		System.out.print("나이 입력: ");
		int age=Integer.parseInt(sc.nextLine());
		
		//db연결
		conn=this.getConnection();
		sql="insert into person (name,blood,age,writeday) values (?,?,?,now())";
		
		try {
			//sql검사
			pstmt=conn.prepareStatement(sql);
			//? 갯수만큼 반드시 바인딩: ?는 1번부터 시작
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);
			
			//실행
			pstmt.execute();
			System.out.println("추가되었습니다!");
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
		
		//db연결
		conn=this.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println();
			System.out.println("\t**Person DB 목록**");
			System.out.println();
			System.out.println("번호\t이름\t혈액형\t나이\t작성일");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
			while(rs.next()) {
				String num = rs.getString("num");
				String name=rs.getString("name");
				String blood=rs.getString("blood").toUpperCase();//대문자로 변환
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
		//이름을 입력후 해당 데이터 삭제
		//삭제 후 "삭제되었습니다"메세지 출력
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="";
		System.out.println();
		System.out.print("삭제할 이름을 입력하세요: ");
		String name=sc.nextLine();
		
		//db연결
		conn=this.getConnection();
		sql="delete from person where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.execute();
			System.out.println(name+"님의 정보가 삭제되었습니다.");
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
		//혈액형별 인원수와 평균 나이 출력(group by)
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs= null;
		String sql="select blood, count(*), avg(age) from person group by blood order by 1";
		
		conn=this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println();
			System.out.println("-----------혈액형별 인원수 및 평균나이------------");
			System.out.println();
			System.out.println("혈액형\t인원수\t평균나이");
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
		
		System.out.println("**메뉴 선택");
		System.out.print("1.추가 2.전체출력 3.삭제 4.분석 5.종료 \n>>");
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
				System.out.println("**프로그램 종료!1");
				System.exit(0);
			}
			
			
				
		}
	}

}
