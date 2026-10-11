package arraylist.demo;

import java.util.ArrayList;

public class demo1 {
    static void main(String[] args){
        //集合：
        //不能储存基本数据类型
        //长度可变
                // 泛型
        ArrayList<String> a=new ArrayList<>();
        System.out.println(a);

        //增删改查，获取长度
        a.add("aba");      //[aba]
        a.add("12");       //[aba,12]
        a.remove("12"); //[aba]
        a.add("cc");       //[aba,cc]
        //String s=a.remove(1);   //返回被删除的元素
        //String s=a.set(1,"ddd");  //返回被覆盖的元素
        //String s=a.get(1);

        //遍历 a.fori
        for (int i = 0; i < a.size(); i++) {
            String s=a.get(i);
            System.out.print(s);
        }


    }
}
