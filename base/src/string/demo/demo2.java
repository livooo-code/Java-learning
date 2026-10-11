package string.demo;

import java.util.Scanner;

public class demo2 {
    static void main(String[] args){
        //"=="在引用数据类型中比较的是地址值
        //boolean equals()
        //boolean equalsIgnoreCase():忽略大小写

        String s1="abc";
        String s2=new String("Abc");
        System.out.println(s1==s2);

        boolean res=s1.equals(s2);
        System.out.println(res);

        boolean res2 =s1.equalsIgnoreCase(s2);
        System.out.println(res2);

        Scanner sc=new Scanner(System.in);
        String s=sc.next(); //new出来的
        System.out.println(s==s1);
    }
}
