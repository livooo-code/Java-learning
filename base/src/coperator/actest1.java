package coperator;

import java.util.Scanner;

public class actest1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数字：");
        int num=sc.nextInt();

        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100;
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);




    }
}
