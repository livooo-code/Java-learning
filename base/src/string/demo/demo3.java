package string.demo;

public class demo3 {
    static void main(String[] args){
        String str="sakamoto taro";
        //str.length().fori
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            System.out.print(c+" ");
        }
    }
}
