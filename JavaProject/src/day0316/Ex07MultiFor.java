package day0316;

public class Ex07MultiFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a++) {
			for(int b=1; b<=5; b++) {
				System.out.print("¢½");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int a=1;a<=5;a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("¢½");
			}
			System.out.println();
		}
		System.out.println("----------");

		for(int a=1;a<=5;a++) {
			for(int b=a; b<=5; b++) {
				System.out.print("¢½");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int a=1;a<=5;a++) {
			for(int b=5; b>=1; b--) {
				if(b>a) 
					System.out.print("  ");
				else
					System.out.print("¢½");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int a=1;a<=5;a++) {
			for(int c=a; c<5; c++) {
				System.out.print("  ");
			}
			for(int b=1; b<=a; b++) {
				System.out.print("¢½");
			}
			System.out.println();
		}
		System.out.println("----------");
	}

}
