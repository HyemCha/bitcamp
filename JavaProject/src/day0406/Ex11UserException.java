package day0406;

import java.util.Scanner;

//사용자 예외 클래스 구현
class UserException extends Exception{
	public UserException(String msg) { //UserException의 생성자
		super(msg);//예외의 메시지로 등록
	}
}

public class Ex11UserException {
	
	public static void writeContent(String msg) throws UserException{ //throws; 예외 발생하면 호출한 곳으로 예외객체(new UserException("고운말을 씁시다!")) 보냄
		if(msg.contains("바보")||msg.contains("멍청"))
			throw new UserException("고운말을 씁시다!"); //throw:강제로 예외발생 시킴. 호출한 곳으로 예외객체를 보냄.
			//throw로 UserException이라는 예외를 강제로 발생시킴.->위의 메서드를 사용하는 쪽에서는 이에 대한 처리를 하도록 강요
		else
			System.out.println("메세지:"+msg);
	}

//	main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("아무 문장이나 입력: "); //문장 입력
			String msg=s.nextLine();
			if(msg.equalsIgnoreCase("q")) //입력받은 문장이 q이면 while문 종료
				break;
			try { 
				//입력받은 문장을 writeContent() 메서드 호출 및 문장 전달 
				//예외가 발생하면 함수에서 예외 객체를 양도받아 catch에 예외객체 전달
				writeContent(msg); //던져진 예외가 있다면 catch 블록에서 받음
			}catch(UserException e) {
				System.out.println("오류메세지:"+e.getMessage());
			}
		}
		System.out.println("**정상 종료**");
	}

}
