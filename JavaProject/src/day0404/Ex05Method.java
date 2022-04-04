package day0404;

class Score{//reference 타입의 변수
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
	//모든 멤버변수는 초기값이 없을 경우 초기값은 null
	private String name;
//	public Score score;
	public Score score=new Score();
	
	//name의 setter&getter
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
		
		//이름 전달
		stu.setName("송혜교");
		//두 과목의 점수
		stu.score.setJava(90);
		stu.score.setSpring(100);
		
		//출력(이름, 자바점수, 스프링 점수 출력)
		System.out.println("이름 : "+stu.getName());
		System.out.println("자바 점수 : "+stu.score.getJava());
		System.out.println("스프링 점수 : "+stu.score.getSpring());
		System.out.println("class : "+stu.score.getClass());
		//out은 다른 클래스의 스테틱 변수
	}

}
