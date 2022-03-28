package day0315;

import java.util.Scanner;

public class Ex1Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		int num;
		int cost;
		
		System.out.println("상품명: ");
		name=sc.nextLine();
		System.out.println("수량: ");
		num = sc.nextInt();
		System.out.println("단가: ");
		cost = sc.nextInt();
		
		int result;
		
		if(num>=5) {
			result = (int)(num*cost*0.9);
			System.out.println("총 금액은 "+result+"원 입니다.");
		} else
			result = num*cost;;
			System.out.println("총 금액은 10프로 디씨한 "+result+"원 입니다.");
	}

}
