package structure.demo;

import java.util.Scanner;

public class swdemo2 {
    public static  void main(String[] args){
        //if:对范围的判断
        //switch：对有限个选项的选择
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
        switch (week){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("error");
        }
    }
}
