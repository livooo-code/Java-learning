package string.demo;

public class demo6 {
    static void main(String[] args){
        //stringbuilder
        //视为一个可以改变里面的值的字符串容器，提高字符串的操作效率
        //多用于字符串拼接和字符串反转
        StringBuilder sb=new StringBuilder("hello");
        //打印对象为属性值不是地址值
        sb.append("world").reverse().reverse();
        int len=sb.length();
        System.out.println(len);
        System.out.println(sb);

        //把stringbuilder对象变回字符串
        String str=sb.toString();
        System.out.println(str);
    }
}
