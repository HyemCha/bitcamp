package day0404;

public class Ex07CallBy {
	
	public static void dataIn(Person p) {
		p.name="��ȣ��";
		p.addr="�λ�";
	}
	
	public static void dataOut(Person p) {
		System.out.println("** �� Ȯ�� **");
		System.out.println("�̸� : "+p.name+", �ּ� : "+p.addr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		//�ּҰ� ���޵ǹǷ� dataIn���� �Էµ� �����ʹ� person�� �����
		dataIn(person);
		//dataIn���� ������ �����Ͱ� ��µ�
		dataOut(person);
		
		System.out.println(person);
	}

}
