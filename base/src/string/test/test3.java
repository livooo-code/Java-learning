package string.test;

import java.util.StringJoiner;

public class test3 {
    static void main(String[] args){
        int[] arr={1,2,3};
        String s=arrToString(arr);
        String s2=arrToString2(arr);
        String s3=arrToString3(arr);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

    }
    public static String arrToString(int[] a){
        if(a==null) return "";
        if(a.length==0) return "[]";
        String r="[";
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1) r=r+a[i];
            else  r=r+a[i]+',';
        }
        r=r+']';
        return r;
    }
    public static String arrToString2(int[] a){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1) sb.append(a[i]);
            else  sb.append(a[i]).append(",");
        }
        return sb.append(']').toString();
    }
    public static String arrToString3(int[] a){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < a.length; i++) {
            sj.add(a[i]+"");
        }
        return sj.toString();
    }

}
