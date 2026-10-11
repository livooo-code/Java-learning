package string.test;

import java.util.Random;
import java.util.Scanner;

public class test9 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] a=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            Random r=new Random();
            int index=r.nextInt(a.length-1);
            char temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        System.out.println(a);
    }
}
