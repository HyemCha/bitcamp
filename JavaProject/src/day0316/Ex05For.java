package day0316;

public class Ex05For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		for(a=1; a<=5; a++) {
			System.out.printf("%3d", a);
		}
		System.out.println();

		for(a = 5; a>=1; a--) {
			System.out.printf("%3d",a);
		}
		System.out.println();
		
		for(a = 1; a<=20; a+=3)
			System.out.printf("%3d",a);
		System.out.println();
		
		System.out.println("1부터 100까지 중 짝수의 합");
		int sum = 0;
		for(a=1; a<=100; a++) {
			if(a%2==1)
				continue;
			else
				sum+=a;
		}
		System.out.println(sum);
	}

}
