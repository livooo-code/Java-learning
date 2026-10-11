package method.test;

public class test6 {
    static void main(String[] args){
        isPrime(101,200);
    }
    static void isPrime(int start,int end){
        for (int i = start; i <end+1 ; i++) {
            boolean flag=true;
            for (int j = 2; j*j < i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }
}
