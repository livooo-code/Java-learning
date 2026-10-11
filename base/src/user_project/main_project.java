package user_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main_project {

    static ArrayList<user> list=new ArrayList<>();

    //静态代码块：默认用户信息,即数据初始化
    static {
        list.add(new user("saka","1234","431126199711213452","18097642380"));
    }

    static void main(String[] args){
        ArrayList<user> u=new ArrayList<>();
        while (true) {
            System.out.println("------welcome to the students system------");
            System.out.println("Input your choice:1.register 2.Login 3.forget password");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1->register(u);
                case 2->login(u);
                case 3->forgetps(u);
                case 4->System.exit(0);
                default->System.out.println("error");
            }
        }
    }
    public static void register(ArrayList<user> u){
        Scanner sc=new Scanner(System.in);
        String name;
        while (true) {
            System.out.println("Input your username:");
            name=sc.next();
            boolean f1=checkUsername(name);
            if(!f1) System.out.println("format wrong");
            else{
                if(!contains(u,name)){
                    System.out.println("success,continue to input your info");
                    break;
                }else {
                    System.out.println("username" + " " + name + " " + "already existed");
                }
            }
        }
        String pw1;
        while (true) {
            System.out.println("Input your password:");
            pw1=sc.next();
            System.out.println("Input your password again:");
            String pw2=sc.next();
            if(!pw1.equals(pw2)) System.out.println("Different!");
            else{
                System.out.println("success,continue to input your info");
                break;
            }
        }
        String id;
        while (true) {
            System.out.println("Input your id:");
            id=sc.next();
            boolean f=checkId(id);
            if(f){
                System.out.println("success,continue input your info");
                break;
            }
            else System.out.println("error,try again");

        }
        String tel;
        while (true) {
            System.out.println("Input your tel:");
            tel=sc.next();
            boolean f=checkTel(tel);
            if(f){
                System.out.println("success");
                break;
            }
            else System.out.println("error,try again");

        }

        user x=new user(name,pw1,id,tel);
        u.add(x);
        System.out.println("Register successfully");
        printList(u);

    }
    public static void login(ArrayList<user> u){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input username:");
            String name=sc.next();
            if(!contains(u,name)){
                System.out.println("Not found");
                return;
            }
            System.out.println("Input password:");
            String psw=sc.next();

            while (true) {
                String rightCode=code();
                System.out.println("code:"+rightCode);
                String code=sc.next();
                if(code.equalsIgnoreCase(rightCode)){
                    System.out.println("correct code");
                    break;
                }
                else System.out.println("error,try again");
            }

            user userInfo=new user(name,psw,null,null);
            boolean f=checkInfo(userInfo,u);
            if(f){
                System.out.println("Login successfully");
                break;
            }else{
                if(i==2){
                    System.out.println("Your account is locked now");
                    return;
                }
                else System.out.println("username or password is wrong," +
                        "you still have"+(2-i)+"chance(s).");
            }
        }



    }
    public static void forgetps(ArrayList<user> u){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input username:");
        String name=sc.next();
        if(!contains(u,name)){
            System.out.println("Not found");
            return;
        }
        System.out.println("Input your id:");
        String id=sc.next();
        System.out.println("Input your tel:");
        String tel=sc.next();

        int index=findIndex(u,name);
        user t=u.get(index);
        if(!((id.equals(t.getId()))&&(tel.equals(t.getTel())))){
            System.out.println("error");
            return;
        }

        String psw;
        while (true) {
            System.out.println("Input new password:");
            psw=sc.next();
            System.out.println("Input new password again:");
            String psw2=sc.next();
            if(psw.equals(psw2)){
                System.out.println("correspond");
                break;
            }else{
                System.out.println("different");
            }
        }
        t.setPassword(psw);
        System.out.println("change successfully");


    }
    public static boolean checkUsername(String x){
        int len=x.length();
        if(len<3||len>15) return false;
        for (int i = 0; i < x.length(); i++) {
            char c=x.charAt(i);
            if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))){
                return false;
            }
        }
        int count=0;
        for (int i = 0; i < x.length(); i++) {
            char c=x.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                count++;
                break;
            }
        }
        return count>0;
    }
    public static boolean contains(ArrayList<user> u,String x){
        for (int i = 0; i < u.size(); i++) {
            if(u.get(i).getName().equals(x)) return true;
        }
        return false;
    }
    public static boolean checkId(String x){
        if(x.length()!=18||x.charAt(0)=='0') return false;
        for (int i = 0; i < x.length()-1; i++) {
            char c=x.charAt(i);
            if(c<'0'||c>'9') return false;
        }
        char end=x.charAt(x.length()-1);
        return (end == 'x') || (end == 'X') || (end >= '0' && end <= '9');
    }
    public static boolean checkTel(String x){
        if((x.length()!=11)||(x.startsWith("0"))) return false;
        for (int i = 0; i < x.length(); i++) {
            char c=x.charAt(i);
            if(c>'9'||c<'0') return false;
        }
        return true;
    }
    public static void printList(ArrayList<user> u){
        for (int i = 0; i < u.size(); i++) {
            user x=u.get(i);
            System.out.println(x.getName()+" "
                    +x.getPassword()+" "
                    +x.getId()+" "
                    +x.getTel());
        }
    }
    public static String code(){
        ArrayList<Character> ch=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            ch.add((char)('a'+i));
            ch.add((char)('A'+i));
        }
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(ch.size());
            sb.append(ch.get(index));
        }
        sb.append(r.nextInt(10));
        char[] t=sb.toString().toCharArray();
        int randomIndex=r.nextInt(t.length);
        char temp=t[randomIndex];
        t[randomIndex]=t[t.length-1];
        t[t.length-1]=temp;
        return new String(t) ;




    }
    public static boolean checkInfo(user x,ArrayList<user> u){
        for (int i = 0; i < u.size(); i++) {
            user t=u.get(i);
            if((t.getName().equals(x.getName()))
                    &&(t.getPassword().equals(x.getPassword()))){
                return true;
            }
        }
        return false;
    }
    public static int findIndex(ArrayList<user> u,String x){
        for (int i = 0; i < u.size(); i++) {
            user y=u.get(i);
            if(y.getName().equals(x)) return i;
        }
        return -1;
    }
}
