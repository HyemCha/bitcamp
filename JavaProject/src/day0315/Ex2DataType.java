package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 127;
		byte b2 = (byte) 129;
		System.out.println(b1);
		System.out.println(b2); //마이너스값 출력(2의 보수)
		
		float f1 = 123.456789f; //f를 붙이면 4바이트의 float으로 선언됨
		double d1 = 123.45678;
		System.out.println(f1);
		System.out.println(d1);
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		//printf는 변환기호를 이용해서 출력할 때 사용(jdk5에서 추가된 기능)
		//정수 : %d, 실수 : %f, 문자 : %c, 문자열 : %s
		System.out.printf("f1 = %07.1f, d1 = %7.2f\n",f1, d1);
		char ch = 'A';
		System.out.printf("ch = %c\n", ch);// \n은 엔터, \t는 탭
		
		// "<-나오게
		System.out.println("Red" + "Blue");
		 
		// "<- 출력하려면 \"
		System.out.println("\"Red\", \"Blue\"");
		
		//파일의 경로를 나타낼 때 /도 되고 \도 된다.
	}

}
