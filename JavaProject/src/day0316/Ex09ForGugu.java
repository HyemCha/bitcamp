package day0316;

public class Ex09ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2~9단 모두 출력
		 * */
		for(int i=2; i<=9;i++)
			System.out.print("["+i+"단]\t");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}

	}

}
