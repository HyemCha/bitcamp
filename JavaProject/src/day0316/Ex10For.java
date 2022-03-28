package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (예)
		 * 1. 지수승 구하기
		 * 2. 숫자n까지의 합계구하기
		 * 3. 숫자n까지의 팩토리얼 구하기
		 * 4. 종료
		 * */
		
		Scanner s = new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("1. 지수승 구하기");
			System.out.println("2. 숫자n까지의 합계구하기");
			System.out.println("3. 숫자n까지의 팩토리얼 구하기");
			System.out.println("4. 종료");
			System.out.print("1~4 중 선택: ");
			
			menu = s.nextInt();
			
			//4일 경우 종료
			if(menu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(menu) {
			case 1:
			{	int x,y,r=1;
				System.out.print("지수승을 구할 x,y 두 숫자 입력: ");
				x = s.nextInt();
				y = s.nextInt();
				for (int i=1; i<=y; i++)
					r*=x;
				System.out.println(x+"의 "+y+"승은 "+r+"입니다.");
			}
				break;
			case 2:
			{
				int n, sum=0;
				System.out.print("n을 입력: ");
				n = s.nextInt();
				for(int i=1; i<=n; i++)
					sum+=i;
				System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
			}
				break;
			case 3:
			{
				int n, result=1;
				System.out.print("n 입력: ");
				n = s.nextInt();
				for(int i=1; i<=n; i++)
					result*=i;
				System.out.println(n+"!의 값은 "+result+"입니다.");
			}
				break;
			default:
					System.out.println("메뉴를 다시 선택하세요.");
			}
			System.out.println();
		}
		
		

	}

}
