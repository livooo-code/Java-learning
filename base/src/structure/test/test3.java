package structure.test;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    static void main(String[] args){
        Random r=new Random();
        //包头不包尾，包左不包右
        int num=r.nextInt(101);
        int count=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            int x=sc.nextInt();
            count++;
            if(x>num){
                System.out.println("dale");
            }
            else if(x<num){
                System.out.println("xiaole");
            }
            else{
                System.out.println("yes");
                break;
            }

            if(count==3){
                break;
            }

        }

    }
}
