package day0405;

//추상(abstract)메서드를 한 개 이상 포함한 경우
//반드시 클래스도 추상화 시켜야한다.
//abstract 클래스는 일반메서드와 추상메서드 모두 구현 가능하다.
abstract class Parent{
    // public void process(){
    //     // System.out.println("부모가 딱히 하는 일이 없음");
    // }

    //일반 메서드
    public void title(){
        System.out.println("부모만이 하는 일 처리");
    }
    //process가 하는 일은 없지만 오버라이드를 위해서 메서드의 존재는 필요함
    abstract public void process();//미완성의 메서드(abstract)로 구현>추상화
}
//------
class ChildA extends Parent{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        // super.process();
        System.out.println("페인트칠을 합니다.");
    }
}
//------
class ChildB extends Parent{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        // super.process();
        System.out.println("집안 청소를 합니다.");
    }
}

public class Ex7Abstract {

    public static void process(Parent p){
        p.title();//부모만 가진 메서드도 호출 가능
        //다형성 처리
        p.process();//오버라이드 된 메서드
    }
    public static void main(String[] args){
        // process(new Parent()); //abstract라서 에러남. 추상클래스는 객체 생성 불가능
        process(new ChildA());
        process(new ChildB());
    }
}
