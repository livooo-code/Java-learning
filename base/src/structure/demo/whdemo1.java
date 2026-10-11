package structure.demo;

public class whdemo1 {
    public static  void  main(String[] args){
        //for:知道循环次数或循环范围
        //while:只知道循环的结束条件
//        int i=1;
//        while(i<101){
//            System.out.println(i);
//            i++;
//        }


        double i=0.1;
        int count=0;
        while(i<8844430){
            i*=2;
            count++;
        }
        System.out.println(count);
    }
}
