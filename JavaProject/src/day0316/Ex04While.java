package day0316;

import java.util.Scanner;

public class Ex04While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수를 입력받아 총점과 평균과 입력받능 갯수를 구하시오. 
		 * 단, 점수가 1~100이 아닐 경우, 다시 입력(갯수에서 빠짐)
		 * 점수가 0일 경우, 반복문 종료 후 출력
		 */

		Scanner sc = new Scanner(System.in);
		int score, tot, cnt;
		double avg;
		// 초기값 지정
		tot = cnt = 0;

		while (true) {
			System.out.println("점수: ");
			score = sc.nextInt();
			if(score==0)
				break;
			if(score<0 || score>100) {
				System.out.println("/t다시 입력 바람!!");
				continue;//조건식으로 이동, 하던 작업을 멈추고 처음부터 다시 시작
			}
			tot+=score;
			cnt++;
		}
		avg = (double)tot/cnt;
		System.out.println("총입력 개수: "+cnt);
		System.out.println("총합계: "+tot);
		System.out.println("평  균: "+avg);
	}

}
