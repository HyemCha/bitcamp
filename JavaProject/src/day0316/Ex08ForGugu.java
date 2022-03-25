package day0316;

import java.util.Scanner;

public class Ex08ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단 숫자를 입력받아 해당 단을 출력(반복) 단 0 입력시 종료
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("단 입력: ");
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (!(n >= 2 && n <= 9)) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			System.out.println(n + "단");
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + "*" + i + "=" + n * i);
			}

		}

	}

}
