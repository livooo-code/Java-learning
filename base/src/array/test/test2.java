package array.test;

import java.util.Random;

public class test2 {
    static void main(String[] args){
        Random r=new Random();
        int n=r.nextInt(100000);
        System.out.println(n);
        int temp=n;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int[] a=new int[count];
        for (int i = 0; i < a.length; i++) {
            a[a.length-1-i]=n%10;
            n/=10;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
