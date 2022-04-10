package day0407;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01ScoreFile{
    public static void main(String[] args){
        FileReader fr=null;
        BufferedReader br=null;
        int sum=0, cnt=0, score;
        double avg=0;

        try {
            fr=new FileReader("C:\\Users\\chm61\\bit0314\\score.txt");
            br=new BufferedReader(fr);
            while(true){
                String line=br.readLine();
                //null 일 경우 while문 종료
                if(line==null)
                    break;
                //입력한 점수를 계산이 가능한 int로 변환
                try{
                score=Integer.parseInt(line);
                }catch(NumberFormatException e){
                    score=0;
                }
                cnt++;
                sum+=score;
                System.out.printf("%5d",score);
            }
            //평균
            avg=(double)sum/cnt;
            System.out.println();
            System.out.println("개수: "+cnt);
            System.out.println("총점: "+sum);
            System.out.println("평균: "+avg);
            

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없어요:"+e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                if(br!=null) br.close();
                if(fr!=null) fr.close();
                
            } catch (IOException e) {
                //TODO: handle exception
            }
        }
        
    }
}