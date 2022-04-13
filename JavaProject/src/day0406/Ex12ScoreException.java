package day0406;

import java.util.Scanner;

//ScoreException
class ScoreException extends Exception{
	public ScoreException(String msg) {
		super(msg); //exception에 등록
	}
}

public class Ex12ScoreException {
	//writeScore(int score)
	//1~100사이의 값이 오면 "내 점수는 90점 입니다."라고 출력
	//그 이외에는 ScoreException을 강제발생(메세지는 "점수를 제대로 입력해주세요.")
	public static void writeContents(int score) throws ScoreException{
		if(score<1||score>100)
			throw new ScoreException("점수를 제대로 입력해주세요.");
		else
			System.out.println("내 점수는 "+score+"점 입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("점수입력: ");
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
