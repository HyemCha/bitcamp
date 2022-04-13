package day0407;

import java.util.StringTokenizer;

public class SplitTest {
    public static void main(String[] args){
        String str="red,green,blue,yellow,pink";
        //,로 문자열 분리
        System.out.println("split이용");
        String[] color=str.split(",");
        for(String c:color){
            System.out.print(c+" ");
        }
        System.out.println("StringTokenizer 클래스 이용");
        StringTokenizer st=new StringTokenizer(str,",");
        System.out.println("분리할 토큰수:"+st.countTokens());
        while(st.hasMoreTokens()){
            String s=st.nextToken();
            System.out.println(s);
        }
    }
    
}
