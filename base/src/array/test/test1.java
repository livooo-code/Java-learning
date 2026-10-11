package array.test;

public class test1 {
    static void main(String[] args){
        int[] a={1,5,9,3,4};
        int[] b=new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
