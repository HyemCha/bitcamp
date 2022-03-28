package day0315;

import java.util.Scanner;

public class Ex12Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("n?");
		n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("One!!");break;
		case 2:
			System.out.println("Two!!");break;
		case 3:
			System.out.println("Three!!");break;
		default:
			System.out.println("1,2,3, Á¦¿Ü");
		}
		
		sc.nextLine();
		String s;
		System.out.println("³ë¶û, »¡°­, ÆÄ¶û Áß ÀÔ·Â: ");
		s = sc.nextLine();
		switch(s) {
		case "³ë¶û":
			System.out.println("³ë¶ûÀÔ´Ï´Ù");break;
		case "»¡°­":
			System.out.println("»¡°­ÀÔ´Ï´Ù.");break;
		case "ÆÄ¶û":
			System.out.println("ÆÄ¶ûÀÔ´Ï´Ù."); break;
		default:
			System.out.println("¸ðµç »öÀº ¾Æ¸§´Ù¿ö¿ä!!");
		}
	}

}
