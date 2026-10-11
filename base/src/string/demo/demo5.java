package string.demo;

import java.util.Random;

public class demo5 {
    static void main(String[] args){
        //string replace(旧值，新值)
        String talk="lmyd我操你妈";
        String[] arr={"他妈的","我操你妈","你妈的"};
        String[] arr2={"祝你妈身体健康","祝你全家身体健康"};
        for (int i = 0; i < arr.length; i++) {
            Random r=new Random();
            int index=r.nextInt(arr2.length);
            talk=talk.replace(arr[i],arr2[index]);
        }

        System.out.print(talk);


    }
}
