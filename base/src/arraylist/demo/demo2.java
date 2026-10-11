package arraylist.demo;

import java.util.ArrayList;

public class demo2 {
    static void main(String[] args){
        //包装类
        //Byte,Short,Character(char),Integer(int),Long,Float,Double,Boolean
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.print("[");
        for (int i = 0; i < a.size(); i++) {
            if(i==a.size()-1) System.out.print(a.get(i));
            else System.out.print(a.get(i)+",");
        }
        System.out.print("]");
    }
}
