package day0404;

public class Ex01Object {
	//instance ��� ���� ����
	public int score=78; //���������ڴ� default(���� ��Ű�� �������� ���� ����)
	
	//static ��� ����
	public static int jungdap=90;
	
	//static �޼���� �ڱ��ڽ��� �ǹ��ϴ� this��� �ν��Ͻ� ������ ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01Object ex1=new Ex01Object();
		ex1.score=80;
		
		System.out.println(ex1.score);
		
		Ex01Object ex2=new Ex01Object();
		ex2.score=90;
		
		System.out.println(ex2.score);
		
		Ex01Object ex3=new Ex01Object();
		ex3.score=100;

		System.out.println(ex3.score);
		
		System.out.println(jungdap);//���� Ŭ�����̹Ƿ� Ŭ�������� ����
		System.out.println(Ex01Object.jungdap);
	}

}
