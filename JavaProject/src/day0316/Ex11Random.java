package day0316;

public class Ex11Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ ��(����)�� ���ϴ� ����� �ڹٿ��� �ΰ��� ���� Math.random Random Ŭ����
		 */

		for (int i = 1; i <= 5; i++) {
			double a = Math.random();
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~������0~9������ ���� ���ϱ�");
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 10);
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~~������0~99������ ���� ���ϱ�");
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100);
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~������1~100������ ���� ���ϱ�");
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100 + 1);
			System.out.println(a);
		}
		System.out.println();

		System.out.println("^0^~������A~Z������ ������ ���ĺ� ���ϱ�");
		for (int i = 1; i <= 5; i++) {
			char a = (char) (Math.random() * 26 + 65);
			System.out.println(a);
		}
	}

}
