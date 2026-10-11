package array.test;

public class test5 {
    static void main(String[] args){
        int[][] a={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int[] sum=new int[4];
        int res=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i]=sum[i]+a[i][j];
            }
            res+=sum[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }
        System.out.println("s="+res);
    }

}
