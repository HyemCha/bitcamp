package day0316;

import java.util.Random;
import java.util.Scanner;

public class Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1���� 100 ������ ������ ���� rnd �� ������ �� ���ڸ� �˾Ƹ��ߴ� ���α׷��� �ۼ��Ͻÿ� while��,if��,random �޼��� ���
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int rnd, n;
		rnd = r.nextInt(100) + 1;

		int i = 1;
		while (i <= 10) {
			System.out.print(i + ": ");
			n = sc.nextInt();
			if (n == rnd) {
				System.out.println("�¾Ҿ��!!! ������ " + rnd + "�Դϴ�!");
				break;
			} else if (n < rnd)
				System.out.println(n + "���� Ů�ϴ�.");
			else
				System.out.println(n + "���� �۽��ϴ�.");
			i++;
			if (i > 10) {
				System.out.println("�ð��ʰ�!!");
				break;
			}
		}

	}

}
