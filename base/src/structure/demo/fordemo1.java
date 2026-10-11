package structure.demo;

import java.util.Scanner;

public class fordemo1 {
    public static void main(String[] args) {
//        for(int i=1;i<6;i++){
//            System.out.println(i);
//        }
//        for(int z = 5; z >0; z--){
//            System.out.println(z);
//        }
//        int sum=0;
//        for(int i=1;i<101;i++){
//            if(i%2==0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int count=0;
        for(int i=min;i<=max;i++){
            if(i%3==0&&i%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
