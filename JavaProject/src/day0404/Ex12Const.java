package day0404;

import java.util.Calendar;
import java.util.Date;

public class Ex12Const {

	Date date; //Date 클래스 객체 변수 선언
	Calendar cal; //Calendar 클래스 객체 변수 선언
	
//	---------------생성자
	public Ex12Const() {
		date=new Date();
	  //cal=new Calendar();//생성자가 protected라 생성 안 됨
		cal=Calendar.getInstance();
	}
	
//	---------------메서드
	public void write() {
		int y=date.getYear()+1900;
		int m=date.getMonth()+1;
		int d=date.getDate();
		
		System.out.println("오늘날짜: "+y+"년"+m+"월"+d+"일");
	}
//	----------
	public void write2() {
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH)+1;
		int d=cal.get(Calendar.DATE);
		
		System.out.println("오늘날짜: "+y+"년"+m+"월"+d+"일");
	}
	
//	----------------main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Const ex=new Ex12Const();
		ex.write();
		ex.write2();

	}

}
