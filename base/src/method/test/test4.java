package method.test;

public class test4 {
    static void main(String[] args){
        int[] arr={4,9,6,32,1,7,5};
        int[] c=copyOfRange(arr,2,5);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
    static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr =new int[to-from];
        for (int i = from,j=0; i < to; i++,j++) {
            newArr[j]=arr[i];
        }
        return newArr;
    }
}
