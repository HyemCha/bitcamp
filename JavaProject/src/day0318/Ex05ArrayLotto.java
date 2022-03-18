package day0318;

import java.util.Scanner;

public class Ex05ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		int[] lotto = new int[6];
		/*
		 * ���� : �ݾ��� �Է��ϸ� �ݾ׿� �ش��Ѵ� Ƚ����ŭ �ζ� ���� ��� 1~45 ������ �ߺ����� ���� ������ �迭�� ���� �� ������������
		 * ����Ͻÿ�
		 */

		System.out.print("�ݾ�: ");
		money = sc.nextInt();
		
		if(money<1000) {
			System.out.println("*** �ݾ��� �����ϹǷ� ���α׷��� �����մϴ� ***");
			return;
		}

		for (int k = 0; k < money / 1000; k++) {
			System.out.print(k+1+"ȸ: ");
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
