package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 127;
		byte b2 = (byte) 129;
		System.out.println(b1);
		System.out.println(b2); //���̳ʽ��� ���(2�� ����)
		
		float f1 = 123.456789f; //f�� ���̸� 4����Ʈ�� float���� �����
		double d1 = 123.45678;
		System.out.println(f1);
		System.out.println(d1);
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		//printf�� ��ȯ��ȣ�� �̿��ؼ� ����� �� ���(jdk5���� �߰��� ���)
		//���� : %d, �Ǽ� : %f, ���� : %c, ���ڿ� : %s
		System.out.printf("f1 = %07.1f, d1 = %7.2f\n",f1, d1);
		char ch = 'A';
		System.out.printf("ch = %c\n", ch);// \n�� ����, \t�� ��
		
		// "<-������
		System.out.println("Red" + "Blue");
		 
		// "<- ����Ϸ��� \"
		System.out.println("\"Red\", \"Blue\"");
		
		//������ ��θ� ��Ÿ�� �� /�� �ǰ� \�� �ȴ�.
	}

}
