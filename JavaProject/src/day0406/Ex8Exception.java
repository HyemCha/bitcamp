package day0406;

import java.util.Scanner;

public class Ex8Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int su1, su2, sum;
		System.out.print("���� 1 �Է�:");
		try {
			su1=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("ù ���� �߸� �Է������Ƿ� 0���� �ʱ�ȭ�մϴ�");
			su1=0;
		}
		System.out.print("���� 2 �Է�:");
		try {
			su2=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("ù ���� �߸� �Է������Ƿ� 0���� �ʱ�ȭ�մϴ�");
			su2=0;
		}
		
		sum=su1+su2;
		System.out.println(su1+"+"+su2+"="+sum);
		System.out.println("*���� ����*");
	}

}
