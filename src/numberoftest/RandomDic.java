package numberoftest;

import java.util.Random;

public class RandomDic {
    public static void main(String[]args){
      rollDice(2) ;// x=2
    }
    public static void rollDice(int x){
        Random random=new Random();
        for(int i=0;i<x;i++){
            int r=random.nextInt(6-1+1)+1;
            System.out.println(r);
        }
    }
}
