package day0315;

import java.util.Scanner;

public class Ex4Scanner {
//���������� ���ÿ�, �ڵ��ʱ�ȭ �� ��, �����Ⱚ���� �ʱ�ȭ, �� �Է�x->������ �� ����
//Ŭ���� ������ �ڵ� �ʱ�ȭ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg="";
		System.out.println("����� �̸��� �Է��ϼ���");
		msg = sc.nextLine(); //�Է��� �� ���� ��°�� �о�´�.(���ڿ��� �о��)
//		msg = sc.next();//�� �ܾ
		System.out.println("�� �̸��� " + msg + "�Դϴ�.");
		
		int age;
		System.out.println("����� ���̴�?");
		age=sc.nextInt();
		System.out.println(msg+"���� ���̴� "+age);
		
	}

}
