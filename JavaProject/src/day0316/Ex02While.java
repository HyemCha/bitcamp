package day0316;

public class Ex02While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		while (true) {
			System.out.print((char) a);
			a++;
			if (a > 90)
				break;
		}
		System.out.println();

		char b = 'A';
		while (true) {
			System.out.print(b++);
			b=(char)(b+1);
			if (b > 'Z')
				break;
		}
		System.out.println();

	}

}
