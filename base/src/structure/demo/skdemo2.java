package structure.demo;

import java.util.Scanner;

public class skdemo2 {
    static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        //method 1:
        int i=1;
        while(true){
            if(i*i==x){
                System.out.println(i);
                break;
            }
            else if(i*i>x){
                System.out.println(i-1);
                break;
            }else{
                i++;
            }
        }

//        //method 2
//        for(int i=1;i<=x;i++){
//
//        }
    }
}
