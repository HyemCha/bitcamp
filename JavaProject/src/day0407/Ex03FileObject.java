package day0407;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex03FileObject {
    public static final String FILENAME = "C:\\Users\\chm61\\bit0314\\shop.txt";

    public static void shopSave(){
        Scanner sc=new Scanner(System.in);
        System.out.print("상품명: ");
        String sang=sc.nextLine();
        System.out.print("색상: ");
        String color=sc.nextLine();
        System.out.print("단가: ");
        int price=Integer.parseInt(sc.nextLine());

        //Shop객체 생성
        Shop shop=new Shop(sang, color, price);

        //Object 단위로 저장하는 방법
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;

        try {
            fos=new FileOutputStream(FILENAME);
            oos=new ObjectOutputStream(fos);
            //Object 단위로 저장하기
            oos.writeObject(shop);
            System.out.println("저장완료!");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("파일 없음");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                if(oos!=null) oos.close();
                if(fos!=null) fos.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
    public static void shopRead(){
        System.out.println("파일에서 읽은 shop 데이터 출력");
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try {
            fis=new FileInputStream(FILENAME);
            ois=new ObjectInputStream(fis);

            //파일에서 shop단위로 읽기
            Shop shop=(Shop)ois.readObject();
            System.out.println("상품명:"+shop.getSang());
            System.out.println("색상:"+shop.getColor());
            System.out.println("가격:"+shop.getPrice());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                if(fis!=null) fis.close();
                if(ois!=null) ois.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        shopSave();
        shopRead();//실행하자마자 저장하고 읽음
    }
    
}
