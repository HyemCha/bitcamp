package day0406;

import java.io.FileWriter;
import java.io.IOException;

public class Ex13FileException {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			//2��° ������ true�� �߰����
			fw=new FileWriter("C:\\Users\\bitcamp\\bit\\memo1.txt",true);
			fw.write("�̸�:�Ƿη�\n");
			fw.write("�ּ�:����� ������\n");
			fw.write("---------------\n");
			System.out.println("������ Ȯ���ϼ���");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
