package arraylist.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    static void main(String[] args) {
        ArrayList<User> users=new ArrayList<>();

        User a=new User("01","saka",4567);
        User b=new User("02","nagu",3578);
        User c=new User("03","ani",4563);

        users.add(a);
        users.add(b);
        users.add(c);

        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        int i=findUser(x,users);
        if(i==-1) System.out.println("error");
        else System.out.println(users.get(i).getName());

    }
    public static int findUser(String id,ArrayList<User> u){
        int index=-1;
        for (int i = 0; i < u.size(); i++) {
            if(id.equals(u.get(i).getId())) {
                index=i;
                return index;
            }
        }
        return index;
    }
}
