package day0407;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05Map {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();

        //map에 k,v의 쌍으로 데이터 추가
        map.put("name","런쥔");
        map.put("age", "32");
        map.put("addr", "서울");
        map.put("name","Mark");
        System.out.println(map.size());

        System.out.println("**출력1 : key값으로 얻고자할 경우");
        System.out.println("이름 : "+map.get("name"));
        System.out.println("나이 : "+map.get("age"));
        System.out.println("주소 : "+map.get("addr"));
        System.out.println("혈액형 : "+map.get("blood")); //key없는 경우 어떤 결과 나오는지 확인

        System.out.println("**출력1 : Key를 먼저 전체 얻은 후 해당 v값 출력");
        //key는 타입이 Set타입(비순차적, 정복x)
        Set<String> keys=map.keySet();
        for(String key:keys){
            String v=map.get(key);
            System.out.println(key+":"+v);
        }
    }
}
