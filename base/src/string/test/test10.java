package string.test;

import java.util.Random;

public class test10 {
    static void main(String[] args){
        StringBuilder temp=new StringBuilder();
        char[] alphabet=new char[52];
        int index=0;
        for (char c='a';c <= 'z'; c++) {
            alphabet[index++]=c;
        }
        for (char c='A';c <= 'Z'; c++) {
            alphabet[index++]=c;
        }
        for (int i = 0; i < 4; i++) {
            Random r=new Random();
            int a=r.nextInt(52);
            temp.append(alphabet[a]);
        }
        Random x=new Random();
        int b=x.nextInt(10);
        String t=temp.append(b).toString();
        System.out.println(t);

        char[] tarr=t.toCharArray();
        Random y=new Random();
        int c=y.nextInt(tarr.length);
        char tt=tarr[tarr.length-1];
        tarr[tarr.length-1]=tarr[c];
        tarr[c]=tt;

        String res=new String(tarr);
        System.out.println(res);

    }
}
