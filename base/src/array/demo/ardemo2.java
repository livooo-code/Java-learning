package array.demo;

public class ardemo2 {
    static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(arr[2]);
        arr[0]=100;  //覆盖原来的值

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        //自动快速生成遍历数组：arr.fori

        int count =0;
        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%3==0){
                System.out.print(arr2[i]+",");
                count++;
            }
        }
        System.out.println(count);

        double[] arr3={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i]%2==0){
                arr3[i]/=2;
            }else{
                arr3[i]*=2;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }
    }
}
