package day0404;
//������(Constructor
//Ư¡ 1. ��ü ������ �ڵ� ȣ��
//Ư¡ 2. �����ڴ� overloading�� �����ϴ�
//	   3. �����ڸ��� �ݵ�� Ŭ������� ����
//	   4. ����Ÿ���� ����(����: ���������� Ŭ������(����)
//     5. �ַ� ��������� �ʱ�ȭ�� ���
//	   6. ���� �����ڳ����� this()�� ȣ��

class Sawon{
	String name;
	String gender;
	String buseo;
	
	Sawon(){
		this("��浿","����","ȫ����");//3��° ������ ȣ��
//		System.out.println("�⺻ ������");
//		name="����ѹ�";
//		gender="�����ϱ� �����ϱ�";
//		buseo="ȫ�����ϱ�";
	}
	
	Sawon(String name){
		this(name,"����","������");
//		this.name=name;
//		gender="�����ϱ� �����ϱ�";
//		buseo="������";
	}
	
	Sawon(String name, String gender, String buseo){
		this.name=name;
		this.gender=gender;
		this.buseo=buseo;
	}
	
	public void write() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+gender);
		System.out.println("�μ� : "+buseo);
		System.out.println();
	}
}
public class Ex10Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1 = new Sawon();
		s1.write();
		
		Sawon s2=new Sawon("����");
		s2.write();
		
		Sawon s3=new Sawon("�����","����","�λ��");
		s3.write();
		
	}

}
