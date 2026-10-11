package arraylist.test;

import java.util.ArrayList;

public class test3 {
    static void main(String[] args){
        ArrayList<phone> p=new ArrayList<>();

        phone p1=new phone("小米",1000);
        phone p2=new phone("苹果",8000);
        phone p3=new phone("锤子",2999);

        p.add(p1);
        p.add(p2);
        p.add(p3);

        ArrayList<phone> res=getInfo(p);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).getBrand()+":"+res.get(i).getPrice());
        }

    }
    public static ArrayList<phone> getInfo(ArrayList<phone> p){
        ArrayList<phone> x=new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getPrice()<3000){
                x.add(p.get(i));
            }
        }
        return x;
    }
}
