package day0316;

import java.util.Random;
import java.util.Scanner;

public class Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 100 사이의 난수를 변수 rnd 에 저장후 그 숫자를 알아맞추는 프로그램을 작성하시오 while문,if문,random 메서드 사용
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
				System.out.println("맞았어요!!! 정답은 " + rnd + "입니다!");
				break;
			} else if (n < rnd)
				System.out.println(n + "보다 큽니다.");
			else
				System.out.println(n + "보다 작습니다.");
			i++;
			if (i > 10) {
				System.out.println("시간초과!!");
				break;
			}
		}

	}

}
