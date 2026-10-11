package method.test;

import java.util.Random;

public class test7 {
    //输出验证码
    static void main(String[] args){
        //存放字母
        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){//小写字母
                chs[i]=(char)(97+i);
            }else{//大写字母
                chs[i]=(char)(65+i-26);
            }

        }
        Random r=new Random();
        int x=r.nextInt(10);
        passcode(chs,x);
    }
    static void passcode(char[] a,int n){
        Random r=new Random();
        String res="";
        for (int i = 0; i < 4; i++) {
            res=res+a[r.nextInt(a.length)];
        }
        System.out.println(res+n);
//        char[] b=new char[4];
//        for (int i = 0; i < b.length; i++) {
//            b[i]=a[r.nextInt(a.length)];
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]+" ");
//        }
//        System.out.print(n);
    }
}
