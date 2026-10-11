package coperator.demo;

import java.util.Scanner;

public class trdemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input 2 data:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String res=a==b?"yes":"no";
        System.out.println(res);


        int x=150;
        int y=210;
        int z=165;

        int temp=x>y?x:y;
        int max=temp>z?temp:z;

        System.out.println(max);

    }
}
