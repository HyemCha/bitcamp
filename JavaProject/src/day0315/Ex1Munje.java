package day0315;

import java.util.Scanner;

public class Ex1Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		int num;
		int cost;
		
		System.out.println("��ǰ��: ");
		name=sc.nextLine();
		System.out.println("����: ");
		num = sc.nextInt();
		System.out.println("�ܰ�: ");
		cost = sc.nextInt();
		
		int result;
		
		if(num>=5) {
			result = (int)(num*cost*0.9);
			System.out.println("�� �ݾ��� "+result+"�� �Դϴ�.");
		} else
			result = num*cost;;
			System.out.println("�� �ݾ��� 10���� ���� "+result+"�� �Դϴ�.");
	}

}
