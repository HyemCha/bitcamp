package day0404;

class Score{//reference Ÿ���� ����
	private int java;
	private int spring;
	
	//setter method
	public void setJava(int java) {
		this.java=java;
	}
	
	public void setSpring(int spring) {
		this.spring=spring;
	}
	
	//getter method
	public int getJava() {
		return java;
	}
	
	public int getSpring() {
		return spring;
	}
}

class Student{
	//��� ��������� �ʱⰪ�� ���� ��� �ʱⰪ�� null
	private String name;
//	public Score score;
	public Score score=new Score();
	
	//name�� setter&getter
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class Ex05Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		
		//�̸� ����
		stu.setName("������");
		//�� ������ ����
		stu.score.setJava(90);
		stu.score.setSpring(100);
		
		//���(�̸�, �ڹ�����, ������ ���� ���)
		System.out.println("�̸� : "+stu.getName());
		System.out.println("�ڹ� ���� : "+stu.score.getJava());
		System.out.println("������ ���� : "+stu.score.getSpring());
		System.out.println("class : "+stu.score.getClass());
		//out�� �ٸ� Ŭ������ ����ƽ ����
	}

}
