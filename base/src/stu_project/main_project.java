package stu_project;

import user_project.user;

import java.util.ArrayList;
import java.util.Scanner;

public class main_project {




    private static final int add_Stu=1;
    private static final int del_Stu=2;
    private static final int edit_Stu=3;
    private static final int query_Stu=4;
    private static final int exit=5;


    static void main(String[] args){
        //ctrl+alt+t:嵌套循环
        ArrayList<stu> a=new ArrayList<>();

        loop:while (true) {
            System.out.println("---------welcome to the harward students system---------");
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.edit");
            System.out.println("4.query");
            System.out.println("5.exit");
            System.out.println("Input your choice：");
            Scanner sc=new Scanner(System.in);
            int choose=sc.nextInt();

            switch (choose){
                case add_Stu->addStu(a);
                case del_Stu->delStu(a);
                case edit_Stu->editStu(a);
                case query_Stu->queryStu(a);
                case exit->{
                    System.out.println("exited already");
                    break loop; //system.exit(0);
                }
                default -> System.out.println("error");
            }
        }


    }
    public static void addStu(ArrayList<stu> a){
        Scanner sc=new Scanner(System.in);

        stu x=new stu();
        while (true) {
            System.out.println("id:");
            String id=sc.next();
            if(!contains(a,id)){
                x.setId(id);
                break;
            }
            else System.out.println("Already existed,try again");
        }

        System.out.println("name:");
        String name=sc.next();
        x.setName(name);

        System.out.println("age:");
        int age=sc.nextInt();
        x.setAge(age);

        System.out.println("address:");
        String address=sc.next();
        x.setAddress(address);

        a.add(x);
        System.out.println("success");

    }

    public static void delStu(ArrayList<stu> a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the id needed to del:");
        String x=sc.next();
        int index=getIndex(a,x);
        if(contains(a,x)) System.out.println("Not found");
        else a.remove(index);

    }

    public static void editStu(ArrayList<stu> a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the id needed to exit:");
        String x=sc.next();

        int index=getIndex(a,x);
        if(index==-1) System.out.println("Not found");
        else{
            System.out.println("Input your info:");

            System.out.println("name:");
            String name=sc.next();
            a.get(index).setName(name);

            System.out.println("age:");
            int age=sc.nextInt();
            a.get(index).setAge(age);

            System.out.println("address:");
            String address=sc.next();
            a.get(index).setAddress(address);

            System.out.println("edited success");
        }
    }
    public static void queryStu(ArrayList<stu> a){
        if(a.isEmpty()) {
            System.out.println("Not Found,please add it.");
            return;
        }
        System.out.println("id\tname\tage\taddress");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getId()+"\t"+a.get(i).getName()
                    +"\t"+a.get(i).getAge()+"\t"+a.get(i).getAddress());
        }
    }

    public static boolean contains(ArrayList<stu> a,String x){
        return getIndex(a,x)>=0;
    }

    public static int getIndex(ArrayList<stu> a,String x){
        int index=-1;
        for (int i = 0; i < a.size(); i++) {
            if(x.equals(a.get(i).getId())){
                index=i;
                return index;
            }
        }
        return index;
    }
}
