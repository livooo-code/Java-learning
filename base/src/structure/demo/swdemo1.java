package structure.demo;

import java.util.Scanner;

public class swdemo1 {
    public static void main(String[] args){
        //default可以省略，也可以写再任意位置
        //case穿透：break不写导致的，会继续执行下一个case语句体直到遇到break或大括号
        /*新版写法：不用写break，可以去掉大括号
        case 1 ->{
             System.out.println("run");
        }*/
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("run");
                break;
            case 2:
                System.out.println("swim");
                break;
            case 3:
                System.out.println("jog");
                break;
            case 4:
                System.out.println("bike");
                break;
            case 5:
                System.out.println("boxing");
                break;
            case 6:
                System.out.println("climb");
                break;
            case 7:
                System.out.println("relax");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
