package string.test;

import java.util.Scanner;

public class test2 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        int big=0;
        int small=0;
        int dig=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c>='a'&&c<='z') small++;
            else if (c>='A'&&c<='Z') {
                big++;
            } else if (c>='0'&&c<='9') {
                dig++;
            }
        }
        System.out.println("大写字符："+big+",小写字符："+small+"数字字符："+dig);
    }
}
