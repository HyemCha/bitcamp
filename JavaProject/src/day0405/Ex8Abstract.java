package day0405;

import java.util.Scanner;

abstract class Command{
    abstract public void process();
}

class List extends Command{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("list");
    }
}
class Add extends Command{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("add data");
    }
}
class Delete extends Command{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("delete data");
    }
}
class Update extends Command{
    @Override
    public void process() {
        // TODO Auto-generated method stub
        System.out.println("update data");
    }
}

public class Ex8Abstract {

    public static void process(Command com){
        com.process();
    }
    public static void main(String[] args){
        System.out.println("1.Add 2.Update 3.Delete 4.List 5.Exit");
        
        while(true){
            System.out.print("선택=>");
            Scanner sc=new Scanner(System.in);
            int input=sc.nextInt();
            if(input==1){
                process(new Add());
            }else if(input==2){
                process(new Update());
            }else if(input==3){
                process(new Delete());
            }else if(input==4){
                process(new List());
            }else if(input==5){
                break;
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
    
}
