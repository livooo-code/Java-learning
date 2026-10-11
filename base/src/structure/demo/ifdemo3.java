package structure.demo;

import java.util.Scanner;

public class ifdemo3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int grade=sc.nextInt();
        if(grade>=0&&grade<=100){
            if(grade>=90){
                System.out.println("fabulous");
            } else if (grade>=80) {
                System.out.println("well");
            }else {
                System.out.println("not bad");
            }
        }else{
            System.out.println("error");
        }
    }
}
