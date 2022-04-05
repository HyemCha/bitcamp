package day0405;

class Color{
    private String colorName;
    
    Color(){
        // System.out.println("super default constructor");
    }

    Color(String colorName){
        this.colorName=colorName;
        // System.out.println("super 2nd constructor");
    }

    //출력하는 메서드
    public void write(){
        System.out.println("자동차색:"+colorName);
    }
}
//------
class Red extends Color{
    private String myCar;
    Red(){
        // super(); //생략되어있음 call parent's default constructor
        // super("yellow");//인자가 있는 생성자는 생략 안 됨. 반드시 첫 줄!
        System.out.println("sub default constructor");
    }

    Red(String myCar, String colorName){
        super(colorName);
        this.myCar=myCar;
    }
    @Override
    public void write() {
        // TODO Auto-generated method stub
        super.write(); //순서 상관x. 먼저 일처리를 해야하면 먼저 씀
        System.out.println("내차이름:"+myCar);
    }
}

public class Ex4Inheri {
    public static void main(String[] args){
        Red  r1=new Red();
        r1.write();
        System.out.println("-------------------");
        Red r2=new Red("소나타","진주펄색");
        r2.write();
    }
}
