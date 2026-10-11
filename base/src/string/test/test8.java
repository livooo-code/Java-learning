package string.test;

import java.util.Scanner;

public class test8 {
    static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("Input:");
            String s=sc.next();
            boolean flag=checkStr(s);
            if(flag){
                for (int i = 0; i < s.length(); i++) {
                    int t=s.charAt(i)-48;
                    sb.append(toRoma(t)).append(" ");
                }
                System.out.println(sb);
                break;
            }else{
                System.out.println("try again");
            }
        }


    }
    public static String toRoma(int n){
        String[] roma={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return roma[n];
    }
    public static boolean checkStr(String s){
        if(s.length()>9) return false;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c>'9'||c<'0') return false;
        }
        return true;
    }
}
