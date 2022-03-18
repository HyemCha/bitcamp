package day0316;

public class Ex11Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 임의의 수(랜덤)를 구하는 방법이 자바에는 두가지 있음 Math.random Random 클래스
		 */

		for (int i = 1; i <= 5; i++) {
			double a = Math.random();
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~♡♡♡0~9사이의 난수 구하기");
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 10);
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~~♡♡♡0~99사이의 난수 구하기");
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100);
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~♡♡♡1~100사이의 난수 구하기");
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100 + 1);
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~♡♡♡A~Z사이의 임의의 알파벳 구하기");
		for (int i = 1; i <= 5; i++) {
			char a = (char) (Math.random() * 26 + 65);
			System.out.println(a);
		}
	}

}
