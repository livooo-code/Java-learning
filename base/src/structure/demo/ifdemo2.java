package structure.demo;

import java.util.Scanner;

public class ifdemo2 {
    public static  void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=1&&num<=100){
            if(num%2==0){
                System.out.println("right");
            }
            else{
                System.out.println("left");
            }
        }
        else{
            System.out.println("wrong");
        }
    }
}
