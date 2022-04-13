package day0404;

public class Ex08Overloading {

	public static void write(String s) {
		System.out.println("문자열 "+s);
	}
	public static void write(String s1,String s2) {
		System.out.println("문자열 "+s1+","+s2);
	}
	public static void write(int s) {
		System.out.println("정수값 "+s);
	}
	public static void write(String[] s) {
		System.out.println("문자열배열 "+s);
		for(String a:s)
			System.out.print("{"+a+"} ");
		System.out.println();
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write(100);
		write("사과");
		write("red","pink");
//		write("a","b","c");//error
		
		String[] s= {"red","orange","pink","green"};
		write(s);
		
		System.out.println("합계 : "+sum(4,5));
		System.out.println("합계 : "+sum(1.2,6.4));
//		System.out.println("합계 : "+sum("red"));//error
	}

}
