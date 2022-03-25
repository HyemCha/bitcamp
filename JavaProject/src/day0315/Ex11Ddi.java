package day0315;

import java.util.Scanner;

public class Ex11Ddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year; //ÅÂ¾î³­ ³âµµ
		String ddi ; // ¶ìÀúÀå
		//ÅÂ¾î³­ ³âµµ¸¦ ÀÔ·ÂÇÏ¸é ÇØ´çÇÏ´Â ¶ì¸¦ Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥ ±¸Çö
		//ÈùÆ® : ¼­±â 1³âÀº ´ß¶ìÀÌ´Ù
		System.out.println("Ãâ»ı³âµµ: ");
		year=sc.nextInt();
		int a=year%12;
		if(a==0)
			ddi="¿ø¼şÀÌ ¶ì";
		else if(a==1)
			ddi="´ß ¶ì";
		else if(a==2)
			ddi="°³ ¶ì";
		else if(a==3)
			ddi="µÅÁö ¶ì";
		else if(a==4)
			ddi="Áã ¶ì";
		else if(a==5)
			ddi="¼Ò ¶ì";
		else if(a==6)
			ddi="È£¶ûÀÌ ¶ì";
		else if(a==7)
			ddi="Åä³¢ ¶ì";
		else if(a==8)
			ddi="¿ë ¶ì";
		else if(a==9)
			ddi="¹ì ¶ì";
		else if(a==10)
			ddi="¸» ¶ì";
		else
			ddi="¾ç ¶ì";
		
		System.out.println(ddi+"ÀÔ´Ï´Ù.");
		
		ddi= a==0?"¿ø¼şÀÌ ¶ì":a==1?"´ß ¶ì":a==2?"°³":a==3?"µÅÁö":
			 a==4?"Áã":a==5?"¼Ò":a==6?"È£¶ûÀÌ":a==7?"Åä³¢":
			 a==8?"¿ë":a==9?"¹ì":a==10?"¸»":"¾ç";
		System.out.println(ddi);
		

	}

}
