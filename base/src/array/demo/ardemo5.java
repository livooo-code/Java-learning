package array.demo;

import java.util.Random;

public class ardemo5 {
    static void main(String[] args){
        Random r=new Random();
        int[] arr=new int[10];
        double avg=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(101);
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        avg=(double)sum/arr.length;
        System.out.println("平均数："+ avg);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count++;
            }
        }
        System.out.println(count);

    }
}
