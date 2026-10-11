package coperator.demo;

public class acdemo2 {
    public static void main(String[] args){
        //隐式转换：小变大
        //强制转换：大变小
        //byte-short-int-long-float-double
        //byte、short、char在运算的时候会直接转化为int计算
        int a=10;
        int b=(int)12.3;
        System.out.println(b);

        byte b1=100;
        byte b2=12;
        byte result=(byte)(b1+b2);
        System.out.println(result);

        //只要有字符串就是拼接操作，从左到右执行
        System.out.println(1+66+"kui"+1+3);

        //字符会转换成ASCII中的数字进行计算
        char c='a';
        int res=c+1;
        System.out.println(res);
    }
}
