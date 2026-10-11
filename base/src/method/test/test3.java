package method.test;

import java.util.Scanner;

public class test3 {
    static void main(String[] args){
        int []arr={11,22,33,44,55};
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(ifExist(arr,x));

    }
    static boolean ifExist(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
}
