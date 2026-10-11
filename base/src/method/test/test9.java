package method.test;

import java.util.Random;

public class test9 {
    static void main(String[] args){
        int[] a=new int[4];
        Random r=new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(10);
        }
        System.out.print("before:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        code(a);
        back(a);
    }

    static void code(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i]=(a[i]+5)%10;
        }
        for (int i = 0; i < a.length/2; i++) {
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-1-i]=temp;
        }
        System.out.println();
        System.out.print("after:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void back(int[] a){
        for (int i = 0; i < a.length/2; i++) {
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-1-i]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0&&a[i]<=4){
                a[i]+=5;
            }else{
                a[i]-=5;
            }
        }
        System.out.println();
        System.out.print("back:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
