package structure.test;

import java.util.Scanner;

public class test1 {
     static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int rev=0;
        int num=x;//定义临时变量记录x的值用于比较
        while(x!=0){
            int temp=x%10;
            x/=10;
            rev=10*rev+temp;
        }
        System.out.println(rev==num);

    }
}
