package day0318;

public class Ex04ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		/*
		 * 문제 : 1~45 사이의 중복되지 않은 난수를 배열에 저장 후
		 * 			오름차순으로 출력하시오
		 */
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++)
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int l=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=l;
				}
			}
		
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+"   ");
	}

}
