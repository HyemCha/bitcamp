package day0406;

interface InterA {
	public void draw();
}

//interface�� interface�� ��ӹ��� ��� extends
interface InterB extends InterA {
	public void play();
}

//class���� interB�� ������ ��� InterA�� ���� �͵� �������̵� �ؾ� �Ѵ�.
class My1 implements InterB {

	public void show() {
		System.out.println("show");
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}

}

public class Ex1Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My1 a1=new My1();
		a1.draw();
		a1.play();
		a1.show(); //My1�� ������ �ִ� �޼���
		
		
		System.out.println();
		
		InterB a2=new My1(); //Override�� �޼��常 ȣ�� ����
		a2.draw();
		a2.play();
//		a2.show();
	}

}






