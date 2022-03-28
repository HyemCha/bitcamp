package day0315;

import java.util.Scanner;

public class Ex4Scanner {
//지역변수는 스택에, 자동초기화 안 됨, 쓰레기값으로 초기화, 값 입력x->오류날 수 있음
//클래스 변수는 자동 초기화

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg="";
		System.out.println("당신의 이름을 입력하세요");
		msg = sc.nextLine(); //입력한 한 줄을 통째로 읽어온다.(문자열로 읽어옴)
//		msg = sc.next();//한 단어만
		System.out.println("내 이름은 " + msg + "입니다.");
		
		int age;
		System.out.println("당신의 나이는?");
		age=sc.nextInt();
		System.out.println(msg+"님의 나이는 "+age);
		
	}

}
