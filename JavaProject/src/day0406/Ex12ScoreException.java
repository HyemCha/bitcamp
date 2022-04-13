package day0406;

import java.util.Scanner;

//ScoreException
class ScoreException extends Exception{
	public ScoreException(String msg) {
		super(msg); //exception�� ���
	}
}

public class Ex12ScoreException {
	//writeScore(int score)
	//1~100������ ���� ���� "�� ������ 90�� �Դϴ�."��� ���
	//�� �̿ܿ��� ScoreException�� �����߻�(�޼����� "������ ����� �Է����ּ���.")
	public static void writeContents(int score) throws ScoreException{
		if(score<1||score>100)
			throw new ScoreException("������ ����� �Է����ּ���.");
		else
			System.out.println("�� ������ "+score+"�� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�����Է�: ");
			int msg=sc.nextInt();
			if(msg==(0))
				break;
			try {
				writeContents(msg);
			}catch(ScoreException se) {
				System.out.println("error message:"+se.getMessage());
			}
			
		}
		System.out.println("*****quit*****");
	}

}
