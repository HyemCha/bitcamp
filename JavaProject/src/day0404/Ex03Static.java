package day0404;

class Bitcamp{
	String name;
	int age;
	static String study="Java";
}

public class Ex03Static {

	public static void writeBit(Bitcamp stu) {
		System.out.println("�л��� : "+stu.name);
		System.out.println("�л����� : "+stu.age);
		System.out.println("�н����� : "+Bitcamp.study);
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bitcamp younghee=new Bitcamp();
		younghee.name="�̿���";
		younghee.age=24;
//		Bitcamp.study="Java";
		
		Bitcamp chulsoo = new Bitcamp();
		chulsoo.name="��ö��";
		chulsoo.age=27;
		
		Bitcamp miji = new Bitcamp();
		miji.name="������";
		miji.age=30;
		
		//���
		writeBit(younghee);
		writeBit(chulsoo);
		writeBit(miji);
	}

}
