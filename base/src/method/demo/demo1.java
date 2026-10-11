package method.demo;

public class demo1 {
    //方法是程序中最小的执行单元
    //方法与方法是平级关系，不能互相嵌套定义
    //void表示没有返回值
     static void  main(String[] args){
         //格式：static void 方法名(){}
         //调用：方法名()
         text();
         int a=23;
         int b=67;
         test(a,b);
         test(10,12);
         getArea(1.2);
     }

     static void text(){
         System.out.println("Sakamoto");
     }
     static void test(int n,int m){
         int res=n+m;
         System.out.println(res);

     }
     static void getArea(double r){
         double res=r*r*3.14;
         System.out.println(res);
     }
}
