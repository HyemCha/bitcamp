package day0316;

import java.util.Scanner;

public class Ex04While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ �Է¹޾� ������ ��հ� �Է¹޴� ������ ���Ͻÿ�. 
		 * ��, ������ 1~100�� �ƴ� ���, �ٽ� �Է�(�������� ����)
		 * ������ 0�� ���, �ݺ��� ���� �� ���
		 */

		Scanner sc = new Scanner(System.in);
		int score, tot, cnt;
		double avg;
		// �ʱⰪ ����
		tot = cnt = 0;

		while (true) {
			System.out.println("����: ");
			score = sc.nextInt();
			if(score==0)
				break;
			if(score<0 || score>100) {
				System.out.println("/t�ٽ� �Է� �ٶ�!!");
				continue;//���ǽ����� �̵�, �ϴ� �۾��� ���߰� ó������ �ٽ� ����
			}
			tot+=score;
			cnt++;
		}
		avg = (double)tot/cnt;
		System.out.println("���Է� ����: "+cnt);
		System.out.println("���հ�: "+tot);
		System.out.println("��  ��: "+avg);
	}

}
