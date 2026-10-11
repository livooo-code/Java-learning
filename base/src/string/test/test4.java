package string.test;

import java.util.Scanner;

public class test4 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String s =reverse(a);
        System.out.println(s);
    }
    static String reverse(String a){
        String s="";
        for (int i = a.length()-1; i >= 0; i--) {
            s=s+a.charAt(i);
        }
        return s;
    }
}
