package structure.demo;

public class skdemo1 {
    static void main(String[] args){
        for(int i=1;i<101;i++){
            if(i%7==0||i%10==7||i/10==7){
                System.out.println("pass");
                continue;
            }
            System.out.println(i);
        }
    }
}
