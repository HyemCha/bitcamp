package day0316;

public class Ex03DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("while문");
		while(a<10) {
			System.out.println(a);
		}
		
		a = 10;
		System.out.println("do~while문");
		do {
			System.out.println(a++);
		}while(a<10);
		
		System.out.println("---------------");
		System.out.println("1부터 100까지 합계 구하기");
		a = 0;
		int sum = 0;
		while(++a<=100) {
			sum+=a;
		}
		System.out.println(sum);
		
		a = 0;
		int esum = 0, osum =  0;
		System.out.println("1~100까지 짝수의 합과 홀수의 합 따로 구하기");
		while(++a<=100) {
			if(a%2==0)
				esum+=a;
			else
				osum+=a;
		}
		System.out.println("짝수 합계: "+ esum+", 홀수 합계: " + osum);

	}

}
