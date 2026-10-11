package coperator.demo;

public class lgdemo1 {
    public static void main(String[] args){
        //常用：&&、||、！

        //逻辑运算符：
        //&:两边都是真，结果为真
        //|:两边都为假，结果为假
        //^:相同为假，不同为真
        //!:取反

        //短路逻辑运算符：当左边的表达式能确定最终结果，右边就不会参与运行
        //&&:一个为假即为假
        //||:一个为真即为真

        int a=10;
        int b=10;
        boolean res1=++a<5&&++b<5;
        System.out.println(b);

        boolean res2=++a<5&++b<5;
        System.out.println(b);


    }
}
