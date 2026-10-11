package string.test;

import java.util.Scanner;

public class test1 {
    static void main(String[] args){
        //登录原理
        String name="saka";
        String code="abc123";
        for (int i = 0; i < 3; i++) {
            Scanner sc=new Scanner(System.in);
            String input1=sc.next();
            String input2=sc.next();

            if(input1.equals(name)&&input2.equals(code)){
                System.out.println("yes");
                break;
            }else{
                if(i==2) System.out.println("fail");
                else System.out.println("try again");
            }
        }




    }
}
