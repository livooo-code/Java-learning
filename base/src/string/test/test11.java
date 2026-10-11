package string.test;

public class test11 {
    static void main(String[] args){
        String n1="42222";
        String n2="7";
        int res=getNum(n1)*getNum(n2);
        String r=res+"";
        System.out.println(r);
    }
    public static int getNum(String a){
        int rev=0;
        for (int i = 0; i < a.length(); i++) {
            int t=a.charAt(i)-48;
            rev=rev*10+t;
        }
        return rev;
    }
}
