package class_;

public class demo2 {
    private String name;
    private int age;

    //系统默认调用空参构造，可用set赋值
    public demo2(){
        System.out.println("test");
    }

    //带参构造
    public demo2(String name,int age){
        this.name=name;
        this.age=age;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}



