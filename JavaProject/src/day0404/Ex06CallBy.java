package day0404;

class Person{
	String name;
	String addr;
}
public class Ex06CallBy {
	
	public static void changeInt(int a) {
		a=10;
	}
	
	public static void changeArray(int []a) {
		a[2] = 25;
	}
	
	public static void changePerson(Person p) {
		p.addr="���ֵ�";
	}

	//String�� Ŭ����Ÿ�������� ���� ���޵ȴ�.
	public static void changeString(String s) {
		s="apple";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		changeInt(n);//n���� ����(call by value
		System.out.println(n);
		
		int[] arr= {1,5,10};//�迭�� ������ ������(��ü�� �ν�)
		changeArray(arr);//�ּ� ����, call by reference
		for(int a:arr)
			System.out.println(a);
		
		Person p=new Person();
		p.name="ȫ�浿";
		p.addr="����";
		
		changePerson(p);//�ּ� ����, call by reference
		System.out.println(p.name+","+p.addr);
		
		String s="orange";
		changeString(s);//���� ���޵ǹǷ� �޼��忡�� ����� ���� �ݿ� �� ��
		System.out.println(s);
		
		String s1="a";
		String s2=new String("b");
		System.out.println("s1 : "+s1+", s2 : "+s2);
		
		String s3=s1;
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		String s4="a";
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
