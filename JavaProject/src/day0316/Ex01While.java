package day0316;

public class Ex01While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		while (++a <= 5) {
			System.out.println(a);
		}
		System.out.println("�������� ���� a��: "+a);
		
		a = 0;
		while(a++ <= 5) {
			System.out.println(a);
		}
		System.out.println("�������� ���� a��: "+a);

		a = 0;
		while(true) {
			System.out.println(++a);
			if(a==5)
				break;
		}
		System.out.println("�������� ���� a��: "+a);
	}

}
