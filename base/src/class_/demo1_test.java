package class_;

public class demo1_test {
     void main(String[] args){
        //创建对象：
        //类名 对象名=new 类名();
        demo1 p=new demo1();
        
//      普通调用
//        p.brand="xiaomi";
//        p.price=166.0;

        p.setBrand("apple");
        p.setPrice(5000);

        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        p.call();
        p.playGame();
    }
}
