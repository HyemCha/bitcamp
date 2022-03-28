package day0315;
import java.util.Scanner;

public class Ex2Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("숫자 세 개 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max;
		
		max = a>b&&b>c? a : b>a&&a>c? b : c;
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
	}

}
