package day0315;
import java.util.Scanner;

public class Ex2Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("���� �� �� �Է�: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max;
		
		max = a>b&&b>c? a : b>a&&a>c? b : c;
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
	}

}
