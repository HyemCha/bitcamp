package day0315;

public class Ex3String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "happy";
		String s2 = new String("Apple"); //방법2
		System.out.println(s1);
		System.out.println(s2);
		
		int a = 5, b = 5;
		System.out.println(a==b);//기본형은 값으로 비교
		System.out.println(s1==s2); //==클래스 타입에서는 주소 비교
		
		//문자열에서 값이 같은지 비교 : equals 메서드 이용
		System.out.println(s1.equals("Happy"));
		System.out.println(s1.equals("happy"));
		System.out.println(s1.equals(s2));
		
		//만약 대소문자 상관없이 철자만 비교
		System.out.println(s1.equalsIgnoreCase("happy"));
		System.out.println(s2.equalsIgnoreCase("aPPle"));
		
		//문자열의 길이 구하기
		System.out.println(s1.length());
		
		//문자열의 첫글자 구하기 
		char startChar = s1.charAt(0);
		System.out.println(startChar);
		
		//전체를 무조건 대문자 도는 소문자로 출력
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3 = "Have a Nice Day!!";
		System.out.println(s3.startsWith("Have"));//s3문자열이 Have로 시작->true
		System.out.println(s3.endsWith("!"));
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("*"));
	}

}