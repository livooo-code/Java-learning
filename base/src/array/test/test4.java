package array.test;

import java.util.Random;

public class test4 {
    static void main(String[] args){
        int[] code=new int[7];
        System.out.print("中奖号码：");
        Rcode(code);
        System.out.println();
        int[] mycode=new int[7];
        System.out.print("我的号码：");
        Rcode(mycode);

        System.out.println();
        int prize=check(mycode,code);
        System.out.print("奖金为"+prize+"元");

    }
    static void Rcode(int[] a){
        Random x=new Random();
        for (int i = 0; i < a.length-1; i++) {
            a[i]=x.nextInt(1,34);
            a[a.length-1]=x.nextInt(1,17);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    static int check(int[] a,int[] b){
        int prize=0;

        int rc =0;
        for (int i = 0; i < 6; i++) {
            int rnum =a[i];
            //用我的号码去中奖号码中一个个比对，相同即视为中一个
            for (int j = 0; j < 6; j++) {
                if(b[j]==rnum){
                    rc++;
                    break;
                }
            }
        }
        int bc=0;
        int bn=a[6];
        if(bn==b[6]){
            bc++;
        }

        if(rc==6){
            if(bc==1){
                prize=10000000;
            }else{
                prize=5000000;
            }
        } else if (rc==5&&bc==1) {
            prize=3000;
        } else if (rc+bc==5) {
            prize=200;
        } else if (rc+bc==4) {
            prize=10;
        } else if (bc==1) {
            if(rc==2||rc==1||rc==0){
                prize=5;
            }
        }
        return prize;
    }
}
