package day0404;

import java.util.Calendar;
import java.util.Date;

public class Ex12Const {

	Date date; //Date Ŭ���� ��ü ���� ����
	Calendar cal; //Calendar Ŭ���� ��ü ���� ����
	
//	---------------������
	public Ex12Const() {
		date=new Date();
	  //cal=new Calendar();//�����ڰ� protected�� ���� �� ��
		cal=Calendar.getInstance();
	}
	
//	---------------�޼���
	public void write() {
		int y=date.getYear()+1900;
		int m=date.getMonth()+1;
		int d=date.getDate();
		
		System.out.println("���ó�¥: "+y+"��"+m+"��"+d+"��");
	}
//	----------
	public void write2() {
		int y=cal.get(Calendar.YEAR);
		int m=cal.get(Calendar.MONTH)+1;
		int d=cal.get(Calendar.DATE);
		
		System.out.println("���ó�¥: "+y+"��"+m+"��"+d+"��");
	}
	
//	----------------main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Const ex=new Ex12Const();
		ex.write();
		ex.write2();

	}

}
