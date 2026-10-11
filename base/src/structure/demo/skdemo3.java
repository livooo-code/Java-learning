package structure.demo;

import java.util.Scanner;

public class skdemo3 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag=false;
                System.out.println("not prime");
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }


    }
}
