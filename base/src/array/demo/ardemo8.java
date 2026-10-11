package array.demo;

public class ardemo8 {
    static void main(String[] args){
        //静态初始化
        int[][] arr ={
                {11,22},
                {33,44,6,8,9}
        };
        //        System.out.print(arr[0][1]);

        //动态初始化
        int[][] b=new int[3][5];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
