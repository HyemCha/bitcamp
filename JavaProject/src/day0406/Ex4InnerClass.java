package day0406;

//Member ���� Ŭ����
class Outer{
	int a=10;
	static int b=20;
	
	//����Ŭ����
	class Inner{
		int c=30;
//		static int d=40; //member����Ŭ�������� static ���� ���� �Ұ�. �ܺο� ����� static�� ��� ����. Ŭ������ static�̸� ��밡��
		
		public void disp() {
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
		}
	}
	
	public void outerDisp() {
		//����Ŭ���� ����
		Inner in=new Inner();
		in.disp();
	}
}
public class Ex4InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ܺ� Ŭ������ ���� �޼��� ȣ��(�޼��忡�� ����Ŭ���� �����)
		Outer out=new Outer();
		out.outerDisp();
		System.out.println();
		//�ܺ� Ŭ������ �޼��带 ��ġ�� �ʰ� �ٷ� ���� Ŭ������ �޼��带 ȣ���ϰ��� �� ���
		Outer.Inner inner=new Outer().new Inner();
		inner.disp();
	}

}
