package variable;

public class demo2{
	//主入口
	public static void main(String[] args){
		//变量在使用之前需要赋值，变量名不能重复
		
		//标识符
		//由数字、字母、下划线和美元符$构成
		//不能以数字开头
		//不能是关键字
		//区分大小写
		
		int a=10;
		System.out.println(a);
		
		int b=20,z=60;
		System.out.println(a+b);
		
		a=40;
		System.out.println(a);
		
		//byte 范围在-128--127
		byte t=23; 
		System.out.println(t);
		
		long n=9999999999L;  //加L作为后缀
		System.out.println(n);
		
		float f=10.1F;  //加F作为后缀
		System.out.println(f);
		
		char c='坂';
		System.out.println(c);
		
		boolean o=true;
		System.out.println(o);
		
		
	}
}