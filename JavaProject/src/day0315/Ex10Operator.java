package day0315;

import java.util.Scanner;

public class Ex10Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int java, html, oracle;
		//3������ ������ �Է¹޾� �հ�� ����� ���
		//������ ���� ����� 60�̻��̸� "�հ�"
		//�׷��� ������ "���հ�" ó��
		int sum;
		double avg;
		String msg;
		
		System.out.println("3������ ������ ���ʴ�� �Է��Ͻÿ�.: ");
		java = sc.nextInt();
		html = sc.nextInt();
		oracle = sc.nextInt();
		
		sum = java + html + oracle;
		avg = sum/3.0;
		
		System.out.println("�հ�: " + sum);
		System.out.printf("���: %6.2f\n", avg);
		
//		msg = (java>=40&&html>=40&&oracle>=40)&&avg>=60?"�հ�":"���հ�";
//		System.out.println(msg);
		
		//����
		boolean a = java>=40&&html>=40&&oracle>=40&&avg>=60;
		//if
		if(a)
			msg = "�հ�!!";
		else
			msg="���հ�";
		System.out.println(msg);
		
		//����
		msg = a?"�հ�":"���հ�";
		System.out.println(msg);

	}

}