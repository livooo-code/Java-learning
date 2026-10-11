package coperator.demo;

public class acdemo3 {
    public static void main(String[] args){
        int a=10;

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);


        //除=外其他赋值运算符含有强制类型转换
        short s=20;
        s-=9; //s=(short)(s-9)

    }
}
