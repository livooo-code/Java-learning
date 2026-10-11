package array.test;

import java.util.Random;

public class test3 {
    static void main(String[] args){
        int[] arr ={2,588,888,1000,10000};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //通过随机索引确保抽出的金额不重复：即打乱数组顺序
            int index=r.nextInt(5);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"元的奖金被抽出");
        }
    }
}
