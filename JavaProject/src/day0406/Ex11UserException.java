package day0406;

import java.util.Scanner;

//����� ���� Ŭ���� ����
class UserException extends Exception{
	public UserException(String msg) { //UserException�� ������
		super(msg);//������ �޽����� ���
	}
}

public class Ex11UserException {
	
	public static void writeContent(String msg) throws UserException{ //throws; ���� �߻��ϸ� ȣ���� ������ ���ܰ�ü(new UserException("���� ���ô�!")) ����
		if(msg.contains("�ٺ�")||msg.contains("��û"))
			throw new UserException("���� ���ô�!"); //throw:������ ���ܹ߻� ��Ŵ. ȣ���� ������ ���ܰ�ü�� ����.
			//throw�� UserException�̶�� ���ܸ� ������ �߻���Ŵ.->���� �޼��带 ����ϴ� �ʿ����� �̿� ���� ó���� �ϵ��� ����
		else
			System.out.println("�޼���:"+msg);
	}

//	main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("�ƹ� �����̳� �Է�: "); //���� �Է�
			String msg=s.nextLine();
			if(msg.equalsIgnoreCase("q")) //�Է¹��� ������ q�̸� while�� ����
				break;
			try { 
				//�Է¹��� ������ writeContent() �޼��� ȣ�� �� ���� ���� 
				//���ܰ� �߻��ϸ� �Լ����� ���� ��ü�� �絵�޾� catch�� ���ܰ�ü ����
				writeContent(msg); //������ ���ܰ� �ִٸ� catch ��Ͽ��� ����
			}catch(UserException e) {
				System.out.println("�����޼���:"+e.getMessage());
			}
		}
		System.out.println("**���� ����**");
	}

}
