package coperator.demo;

import java.util.Scanner;

public class cpdemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input your fashion score:");
        int myf=sc.nextInt();
        System.out.println("input his/her fashion score:");
        int hf=sc.nextInt();
        boolean res=myf>hf;
        System.out.println(res);
    }
}
