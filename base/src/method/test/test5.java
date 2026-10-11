package method.test;

import java.util.Scanner;

public class test5 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double check=sc.nextInt();
        int month=sc.nextInt();
        System.out.println("input 1 or 0:");
        int seat=sc.nextInt();

        if(month>=5&&month<=10){
            check=getPrice(check,seat,0.9,0.85);
        }else if((month>=1&&month<=4)||(month>=11&&month<=12)){
            check=getPrice(check,seat,0.7,0.65);
        }else{
            System.out.println("error");
        }
        System.out.println(check);
    }
    static double getPrice(double check,int seat,double v1,double v2){
        if(seat==0){
            check*=v1;
        }else if(seat==1){
            check*=v2;
        }else{
            System.out.println("error");
        }
        return check;
    }
}
