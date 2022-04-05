package day0405;

class Fruit{
    private int danga;

    public Fruit(){
        danga=1000;
    }

    Fruit(int danga){
        this.danga=danga;
    }
    public int getDanga() {
        return danga;
    }
}
//---child
class Orange extends Fruit{
    private String name;

    public Orange(){
        //super();
        name="Orange";
    }
    Orange(String name){
        this.name=name;
    }
    Orange(String name, int danga){
        super(danga);//danga(variable) is in parent's class
        this.name=name;
    }

    public void write(){
        System.out.println("name:"+name+",danga:"+this.getDanga());
    }//this.getDanga() : 내 클래스에서 먼저 찾고 없으면 부모 클래스에서 찾음
}

public class Ex5Inheri {
    public static void main(String[] args){
        Orange[] or=new Orange[3];
        or[0]=new Orange();
        or[1]=new Orange("kiwi");
        or[2]=new Orange("strawberry", 3000);

        for(int i=0;i<or.length;i++){
            or[i].write();
        }
    }
}
