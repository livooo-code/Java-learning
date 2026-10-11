package string.demo;

import java.util.StringJoiner;

public class demo7 {
    static void main(String[] args){
        //stringjioner
        //stringjioner(间隔符号),stringjioner(间隔符号，开始符号，结束符号)

        StringJoiner sj=new StringJoiner("---");
        sj.add("aaaa").add("bb");
        System.out.println(sj);
    }
}
