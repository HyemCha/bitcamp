package day0407;

import java.util.List;
import java.util.Vector;

public class Ex07List {
    public static void main(String[] args) {
        List<String> list=new Vector<>();
        list.add("김민아");
        list.add("이진");
        list.add("강호동");
        list.add("이영자");
        list.add("유재석");
        System.out.println("데이터 개수:"+list.size());

        System.out.println("출력방법 #1");
        int idx=0;
        for(String s:list)
            {System.out.println(++idx+":"+s);
            
            }
        
        System.out.println("출력방법 #2");
        for(int i=0; i<list.size();i++){
            System.out.println(i+1+":"+list.get(i));
        }
    }
    
}
