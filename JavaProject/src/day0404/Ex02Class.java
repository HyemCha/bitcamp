package day0404;

class Apple{
	//접근지정자 연습(같으 패키지내에서는 private을 제외하고 모두 접근 가능)
	int a=10;
	protected int b=20;
	private int c=30;
	public int d=40;
	
	public final static String MESSAGE="Hello";
}

public class Ex02Class {//public은 파일명과 같은 class에만 붙을 수 있음

	public static void main(String[] args) {//main은 파일명과 같은 클래스 안에 올 수 있음 
		// TODO Auto-generated method stub
		Apple a1=new Apple();
		System.out.println(a1.a);
		System.out.println(a1.b);
//		System.out.println(a1.c); //error : private은 같은 클래스 내에서만 접근 가능
		System.out.println(a1.d);
		
		System.out.println(Apple.MESSAGE);//static변수는 클래스명으로 호출

	}

}
