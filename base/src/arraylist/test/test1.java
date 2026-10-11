package arraylist.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    static void main(String[] args){
        ArrayList<Stu> s=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Stu a=new Stu();

            System.out.println("name:");
            String name=sc.next();
            System.out.println("age:");
            int age=sc.nextInt();

            a.setName(name);
            a.setAge(age);

            s.add(a);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(s.get(i).getName()+":"+s.get(i).getAge());

        }
    }
}
