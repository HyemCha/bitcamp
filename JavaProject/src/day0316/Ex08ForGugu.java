package day0316;

import java.util.Scanner;

public class Ex08ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ ���ڸ� �Է¹޾� �ش� ���� ���(�ݺ�) �� 0 �Է½� ����
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("�� �Է�: ");
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (!(n >= 2 && n <= 9)) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
			System.out.println(n + "��");
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + "*" + i + "=" + n * i);
			}

		}

	}

}
