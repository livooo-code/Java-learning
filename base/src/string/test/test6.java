package string.test;

import java.util.Scanner;

public class test6 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");
        String s=sc.next();
        String temp=new StringBuilder(s).reverse().toString();
        boolean flag=s.equals(temp);
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
