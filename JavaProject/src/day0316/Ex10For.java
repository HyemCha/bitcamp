package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (��)
		 * 1. ������ ���ϱ�
		 * 2. ����n������ �հ豸�ϱ�
		 * 3. ����n������ ���丮�� ���ϱ�
		 * 4. ����
		 * */
		
		Scanner s = new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("1. ������ ���ϱ�");
			System.out.println("2. ����n������ �հ豸�ϱ�");
			System.out.println("3. ����n������ ���丮�� ���ϱ�");
			System.out.println("4. ����");
			System.out.print("1~4 �� ����: ");
			
			menu = s.nextInt();
			
			//4�� ��� ����
			if(menu==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			switch(menu) {
			case 1:
			{	int x,y,r=1;
				System.out.print("�������� ���� x,y �� ���� �Է�: ");
				x = s.nextInt();
				y = s.nextInt();
				for (int i=1; i<=y; i++)
					r*=x;
				System.out.println(x+"�� "+y+"���� "+r+"�Դϴ�.");
			}
				break;
			case 2:
			{
				int n, sum=0;
				System.out.print("n�� �Է�: ");
				n = s.nextInt();
				for(int i=1; i<=n; i++)
					sum+=i;
				System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
			}
				break;
			case 3:
			{
				int n, result=1;
				System.out.print("n �Է�: ");
				n = s.nextInt();
				for(int i=1; i<=n; i++)
					result*=i;
				System.out.println(n+"!�� ���� "+result+"�Դϴ�.");
			}
				break;
			default:
					System.out.println("�޴��� �ٽ� �����ϼ���.");
			}
			System.out.println();
		}
		
		

	}

}
