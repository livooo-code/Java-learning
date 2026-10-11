package structure.test;

import java.util.Scanner;

public class test2 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=1;
        int temp=y;
        while(x-temp>=y){
            temp+=y;
            count++;
        }
        System.out.println("商："+count);
        System.out.println("余数："+ (x-temp));
    }
}
