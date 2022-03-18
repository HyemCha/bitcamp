package day0318;

import java.util.Scanner;

public class Ex05ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		int[] lotto = new int[6];
		/*
		 * 문제 : 금액을 입력하면 금액에 해당한느 횟수만큼 로또 숫자 출력 1~45 사이의 중복되지 않은 난수를 배열에 저장 후 오름차순으로
		 * 출력하시오
		 */

		System.out.print("금액: ");
		money = sc.nextInt();
		
		if(money<1000) {
			System.out.println("*** 금액이 부족하므로 프로그램을 종료합니다 ***");
			return;
		}

		for (int k = 0; k < money / 1000; k++) {
			System.out.print(k+1+"회: ");
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}

			for (int i = 0; i < lotto.length - 1; i++)
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int l = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = l;
					}
				}

			for (int i = 0; i < lotto.length; i++)
				System.out.printf("%-5d",lotto[i]);
			System.out.println();
		}
	}

}
