package coperator;

import java.util.Scanner;

public class lgtest1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 2 numbers:");
        int a=sc.nextInt();
        int b= sc.nextInt();

        boolean res=a==6||b==6||(a+b)%6==0;
        System.out.println(res);
    }
}
