package string.demo;

public class demo8 {
    static void main(String[] args){
        //字符串拼接原理：
        //没有变量参与：字符串直接相加，编译之后的结果就是拼接之后的结果，会复用串池中的字符串
        //有变量参与：每一次拼接的代码都会在内存中创建新的字符串，浪费内存
        String s1="a";
        String s2="abc"; //记录串池中的地址
        String s3=s1+"b"+"c";//new出来的对象
        String s4="a"+"b"+"c";//复用
        System.out.println(s2==s3);
        System.out.println(s2==s4);

    }
}
