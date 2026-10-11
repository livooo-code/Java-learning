package method.demo;

public class demo3 {
    //方法重载：同一个类中，方法名相同，参数不同（类型个数）的方法。与返回值无关
    static void main(String[] args){
        compare(1,2);
    }
    static void compare(byte b1,byte b2){
        System.out.println(b1==b2);
    }
    static void compare(int b1,int b2){
        System.out.println(b1==b2);
    }
    static void compare(short b1,short b2){
        System.out.println(b1==b2);
    }
    static void compare(long b1,long b2){
        System.out.println(b1==b2);
    }
}
