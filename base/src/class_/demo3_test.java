package class_;

public class demo3_test {
    static void main(String[] args) {
        demo3 user=new demo3("zhang",
                "12we",
                "2356@qq.com",
                "男",12);
        System.out.println(user.getAge()+user.getName()
            +user.getCode()+user.getEmail()+user.getGender());
    }



}
