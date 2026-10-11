package structure.demo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //对布尔类型的变量进行判断，直接写即可，不使用==
        boolean islightGreen =sc.nextBoolean();
        if(islightGreen){
            System.out.println("gogogo!!!");
        }
        else{
            System.out.println("stop!!!");
        }


    }

}
