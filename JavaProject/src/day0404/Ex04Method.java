package day0404;

public class Ex04Method {
	private String name;
	private int age;
	
	//setter method: �� ����� �ʿ��� �޼���
	public void setName(String name) {
		this.name=name;//���ڰ� ���� �̸��� ��� ��������� �տ� �ݵ�� this�� ���δ�.
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	//getter method: ����������� ��ȯ�ϱ� ���� �޼���
	public String getName() {
		return this.name;//this�� ��������
	}
	
	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04Method ex1=new Ex04Method();
		ex1.setName("�̱���");
		ex1.setAge(25);
		
		Ex04Method ex2=new Ex04Method();
		ex2.setName("������");
		ex2.setAge(30);
		
		System.out.println("�̸� : "+ex1.getName());
		System.out.println("���� : "+ex1.getAge());
		System.out.println();

		System.out.println("�̸� : "+ex2.getName());
		System.out.println("���� : "+ex2.getAge());
		
	}

}
