package day0404;

class Bitcamp{
	String name;
	int age;
	static String study="Java";
}

public class Ex03Static {

	public static void writeBit(Bitcamp stu) {
		System.out.println("학생명 : "+stu.name);
		System.out.println("학생나이 : "+stu.age);
		System.out.println("학습과목 : "+Bitcamp.study);
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bitcamp younghee=new Bitcamp();
		younghee.name="이영희";
		younghee.age=24;
//		Bitcamp.study="Java";
		
		Bitcamp chulsoo = new Bitcamp();
		chulsoo.name="김철수";
		chulsoo.age=27;
		
		Bitcamp miji = new Bitcamp();
		miji.name="윤미자";
		miji.age=30;
		
		//출력
		writeBit(younghee);
		writeBit(chulsoo);
		writeBit(miji);
	}

}
