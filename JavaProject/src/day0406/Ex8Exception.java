package day0406;

import java.util.Scanner;

public class Ex8Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int su1, su2, sum;
		System.out.print("숫자 1 입력:");
		try {
			su1=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("첫 숫자 잘못 입력했으므로 0으로 초기화합니다");
			su1=0;
		}
		System.out.print("숫자 2 입력:");
		try {
			su2=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("첫 숫자 잘못 입력했으므로 0으로 초기화합니다");
			su2=0;
		}
		
		sum=su1+su2;
		System.out.println(su1+"+"+su2+"="+sum);
		System.out.println("*정상 종료*");
	}

}
