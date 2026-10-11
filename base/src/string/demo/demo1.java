package string.demo;

public class demo1 {
    static void main(String[] args){
    //string是Java定义好的一个类，定义在java.lang中，使用时不需要导包
    //字符串不可变，一旦创建值不能更改

        //使用双引号直接赋值，系统会检查该字符串在串池中是否存在
        //不存在：创建新的；存在：复用
        String s="saka";

        //每new一次都会在堆创建新的内存空间
        String x=new String(); //空白字符串
        String a=new String("nagu");

        //用于修改字符串的内容
        char[] chs={'a','b','v'};
        String b=new String(chs);

        //字节信息转换
        byte[] bytes={97,99,100};
        String s1=new String(bytes);
        System.out.println(s1);
        System.out.println("@"+x+s);
        System.out.println(b+a);
    }
}
