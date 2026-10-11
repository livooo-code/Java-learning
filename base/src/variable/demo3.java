package variable;//1.导包:写在类定义的上方
import java.util.Scanner;


public class demo3{
	public static void main(String[] args){
		
		//键盘录入
		//2.创建对象
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		//3.接受数据
		int i=sc.nextInt();
		int a=sc.nextInt();
		System.out.println(i+a);
		
		
	}
}