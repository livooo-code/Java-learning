package method.test;

public class test2 {
    static void main(String[] args){
        int []arr={11,22,33,44,55};
        System.out.println(searchMax(arr));
    }
    static int searchMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
