package day0407;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import javax.management.ValueExp;

public class Ex08ListFile {
    public static final String FILENAME="C:\\Users\\chm61\\bit0314\\person.txt";
    List<Person> list;
    Scanner sc;
    
    public Ex08ListFile(){
        list=new Vector<>();
        sc=new Scanner(System.in);

        fileRead();
    }

    //처음 시작시 파일을 읽어서 list에 데이터 넣기
    public void fileRead(){
        FileReader fr=null;
        BufferedReader br=null;
        try {
            fr=new FileReader(FILENAME);
            br=new BufferedReader(fr);
            while(true){
                String line=br.readLine();
                if(line==null){
                    break;
                }
                String[] s=line.split(",");
                Person p=new Person();
                p.setName(s[0]);
                p.setGender(s[1]);
                p.setAddr(s[2]);
                //list에 추가
                list.add(p);
            }
            System.out.println("총 "+list.size()+"개의 데이터 읽어옴!");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("저장된 데이터 없음");
        } finally{
            try {
                if(br!=null) br.close();
                if(fr!=null) fr.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    public void fileWrite(){
        //FileWriter 생성 후 list의 내용을 저장하기(*컴마로 연결해서 저장)
        FileWriter fw=null;

        try {
            fw=new FileWriter(FILENAME);
            for(Person p:list){
                String data = p.getName() + "," + p.getGender() + "," + p.getAddr() + "\n";
                fw.write(data);
            }
        } catch (Exception e) {
            //TODO: handle exception
        } finally{
            if(fw!=null)
                try {
                    fw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
    }

    //메뉴 숫자 입력후 리턴
    public int getMenu(){
        System.out.println("  **메뉴 선택**");
        System.out.println("1.추가 2. 전체출력 3.삭제 5.저장 및 종료");
        int n=Integer.parseInt(sc.nextLine());
        return n;
    }

    //이름으로 찾아서 삭제하기
    public void dataDelete(){
        boolean find = false;
        String searchName;
        System.out.println("삭제할 이름 입력 : ");
        searchName=sc.nextLine();

        for(int i=0; i<list.size();i++){
            Person p=list.get(i);//i번째 Person을 얻는다
            //이름 비교
            if(searchName.equals(p.getName())){
                find=true; //찾았으니 true로 변경
                list.remove(i); //i번 데이터 삭제
                break;
            }
        }
    }

    //데이터 입력 후 list에 추가하는 메서드
    public void dataAdd(){
        System.out.print("이름 > ");
        String name=sc.nextLine();
        System.out.print("성별 > ");
        String gender=sc.nextLine();
        System.out.print("주소 > ");
        String addr=sc.nextLine();

        //Person 객체 생성
        Person p=new Person();
        p.setName(name);
        p.setGender(gender);
        p.setAddr(addr);

        //list에 추가
        list.add(p);

        System.out.println(list.size()+"번째 데이터가 추가되었습니다.");
    }

    //전체 출력
    public void dataAllWrite(){
        System.out.println("번호\t이름\t성별\t주소");
        System.out.println("-----------------------------");
        int n=0;
        for(Person p:list){
            System.out.println(++n+"\t"+p.getName()+"\t"+p.getGender()+"\t"+p.getAddr());
        }
    }
    public static void main(String[] args) {
        Ex08ListFile ex=new Ex08ListFile();
        while(true){
            int n=ex.getMenu();
            switch (n) {
                case 1:
                    ex.dataAdd();
                    break;
                case 2:
                    ex.dataAllWrite();
                    break;
                case 3:
                    ex.dataDelete();
                    break;
                case 5:
                    System.out.println("**저장 후 프로그램 종료**");
                    ex.fileWrite();
                    System.exit(0);
            }
            System.out.println();
        }
    } 
}
