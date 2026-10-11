package string.test;

public class test12 {
    static void main(String[] args){
        String s="Hello world";
        StringBuilder sb=new StringBuilder();
        int len=0;
        for (int i = s.length()-1; i >0; i--) {
            char c=s.charAt(i);
            if(c==' ') break;
            sb.append(c);
            len++;
        }
        System.out.println(sb.reverse()+":"+len);
    }
}
