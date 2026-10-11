package class_;
// public class 类名{
//  1.成员变量（属性）:修饰符 数据类型 变量名称=初始化值
//  2.成员方法（行为）
//  }

//成员变量和方法中的局部变量重名时，遵循就近原则即使用局部变量的值
//成员变量：随对象的创建而存在，随对象的消失而消失
//局部变量：随方法的调用而存在，随着方法的运行结束而消失
//如需调用成员变量，可使用this.变量名
//this:代表所在方法调用者的地址


//封装：对象代表什么，就要封装对应的数据，并提供数据对应的行为
//eg：人关门，人给门一个作用力，但是门是自己关的
public class demo1 {

    private String brand;
    private double price;

    //针对每一个私有化的成员变量，都要提供get和set方法
//    set：给成员变量赋值
//    get：对外提供成员变量的值


    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(double a){
        if(a<0){
            System.out.println("error");
        }else{
            price=a;
        }
    }
    public double getPrice(){
        return price;
    }


    public void call(){
        System.out.println("test1");
    }
    public void playGame(){
        System.out.println("test2");
    }
}

