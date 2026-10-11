package method.test;

import java.util.Random;

public class test8 {
    static void main(String[] args){
        int[] score=new int[6];
        Random r=new Random();

        int sum=0;
        for (int i = 0; i < score.length; i++) {
            score[i]=r.nextInt(101);
            sum+=score[i];
            System.out.print(score[i]+" ");
        }
        int max=score[0];
        int min=score[0];
        for (int i = 0; i < score.length; i++) {
            if(score[i]>max){
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
            }
        }
        int avg=(sum-max-min)/4;
        System.out.println(avg);
    }
}
