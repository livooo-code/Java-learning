package class_;

public class demo2_test {
    static void main(String[] args){
        //空参构造
//        demo2 s=new demo2();

        //带参构造
        demo2 a=new demo2("sakamoto",27);
        System.out.println(a.getName());
        System.out.println(a.getAge());
    }
}
