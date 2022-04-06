package day0406;

import java.util.List;
import java.util.Vector;

interface Apple{
	public void process1();
}

interface Banana{
	public void process2();
}

//두 개의 인터페이스르 모두 구현하는 클래스
class My2 implements Apple, Banana{

	public void show() {
		System.out.println("My2만이 가진 메서드");
	}
	@Override
	public void process2() {
		// TODO Auto-generated method stub
		System.out.println("Banana 기능 구현");
	}

	@Override
	public void process1() {
		// TODO Auto-generated method stub
		System.out.println("Apple 기능 구현");
	}
	
}

public class Ex2Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My2 a1=new My2();
		a1.show();
		a1.process1();
		a1.process2();
		System.out.println();
		
		Apple a2=new My2();
		a2.process1();
		System.out.println();
		
		Banana a3=new My2();
		a3.process2();
		System.out.println();
		
	}

	
	
	
}
