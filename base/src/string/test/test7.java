package string.test;

public class test7 {
    static void main(String[] args){
        String a="abcde";
        String b="eakcd";
        System.out.println(check(a,b));

    }
    public static String rotate(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb.append(s.charAt(0));
        return sb.toString();
    }
    public static String rotate2(String s){
        char f=s.charAt(0);
        String end=s.substring(1);
        return end+f;
    }
    public static String rotate3(String s){
        char[] a=s.toCharArray();
        char f=a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1]=a[i];
        }
        a[a.length-1]=f;
        String news=new String(a);
        return news;
    }
    public static boolean check(String a,String b){
        for (int i = 0; i < a.length(); i++) {
            a=rotate3(a);
            if(a.equals(b)){
                return true;
            }
        }
        return false;
    }
}
