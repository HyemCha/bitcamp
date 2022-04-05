package day0405;

//interface는 상수와 추상메서드만 구현 가능
interface InterA{
    int SPEED=100; //final 상수
    public void speedWrite(); //abstract 메서드
}

//인터페이스를 구현하는 클래스
class My implements InterA{
    @Override
    public void speedWrite() {
        // TODO Auto-generated method stub
        // SPEED=120; //상수이므로 value 변경 안 됨
        System.out.println("나의 스피드는 "+SPEED+"입니다.");
    }
}

public class Ex9Interface {
    public static void main(String[] args){
        InterA a=new My();
        a.speedWrite();
        
    }
}
