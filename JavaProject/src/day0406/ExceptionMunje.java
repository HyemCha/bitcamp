package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		int cnt = 0, sum = 0;
		System.out.println("������");
		try {
			fileReader = new FileReader("C:\\Users\\bitcamp\\bit\\score.txt");
			bufferedReader = new BufferedReader(fileReader);
			while (true) {
				String s = bufferedReader.readLine();
				if (s == null)
					break;
				cnt++;
				System.out.print(s + " ");
				sum += Integer.parseInt(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �����:" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				if (fileReader != null)
					fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("�� " + cnt + "��");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (double) sum / cnt);
	}

}
