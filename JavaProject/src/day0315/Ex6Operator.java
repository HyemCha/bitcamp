package day0315;

public class Ex6Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**���������� ����**");
		int a = 5, b = 5, x, y;
		x = a++; // ��ġ���������� x=a;++a;
		y = ++b; // ��ġ����������

		System.out.println(a + "," + b);
		System.out.println(x + "," + y);

		a = b = x = 3;
		y = ++a + b-- * ++x;
		System.out.println(y);

		a = 3;
		System.out.println(a++);
		System.out.println(++a);

		System.out.println("**���� ������ ����**");
		a = 5;
		a += 3; // 8
		System.out.println(a);
		a *= 5; // 40
		System.out.println(a);
		a -= 2; //38
		System.out.println(a);
		a /= 3; // 12
		System.out.println(a);
		a %= 5; // 2
		System.out.println(a);
	}

}
