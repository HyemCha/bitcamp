package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본형 연습
		char ch = 'A';
		char ch2 = '가';
		char ch3 = 67; //'C'
		char ch4 = (char) (ch3 + 2); //int로 형변환
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		
		int a = 7;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a / b);
		System.out.println((double)a / b); //a를 계산할 때만 double로 변환해서 계산
		System.out.println(a);
	}

}
