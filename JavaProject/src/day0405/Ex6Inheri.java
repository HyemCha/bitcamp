package day0405;

class SuperObj{
    public void process(){
        System.out.println("super 부모가 공통적인 일을 처리합니다.");
    }
}
//-----------
class Draw extends SuperObj{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        super.process();
        System.out.println("i draw!");
    }
}
//-----------
class Game extends SuperObj{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        super.process();
        System.out.println("i'm gaiming!");
    }
}



public class Ex6Inheri {

    public static void process(SuperObj obj){
        obj.process();
    }
    public static void main(String[] args){
        // SuperObj obj=null;
        // obj=new Draw();
        // obj.process();

        // obj=new Game();
        // obj.process();

        process(new Draw());
        process(new Game());
    }
}
