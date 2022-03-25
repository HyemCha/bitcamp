package day0315;

import java.util.Scanner;

public class Ex9Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor; //국어 점수
		String msg; //결과 메세지
		//국어 점수를 입력 후 90이상이면 "Excellent!"라고 msg에 저장
		//90미만이면 "Try!!!"라고 저장
		System.out.println("국어점수 : ");
		kor = sc.nextInt();
		if(kor>=90) 
			msg = "Excellent!!";
		else if(kor>=80)
			msg = "Good!";
		else
			msg = "Try!!";
		System.out.println(kor + "=>"+msg);
		
		msg = kor>=90?"Excellent!!":kor>=80?"Good":"Try";
		System.out.println(kor+"=>"+msg);

	}

}
