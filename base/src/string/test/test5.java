package string.test;

import java.util.Scanner;

public class test5 {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        if(money<0||money>9999999){
            System.out.println("error");
            return;
        }
        String moneyStr="";
        while (true){
            int temp=money%10;
            String cNum=digitalToStr(temp);
            moneyStr=cNum+moneyStr;
            money/=10;
            if(money==0) break;
        }

        while (moneyStr.length() < 7) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);
        String[] dw={"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String res="";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c=moneyStr.charAt(i);
            //两者长度相同
            res=res+c+dw[i];
        }
        System.out.print(res);
    }

    static String digitalToStr(int a){
        String[] ch={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return ch[a];
    }
}
