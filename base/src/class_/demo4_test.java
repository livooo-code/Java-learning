package class_;

public class demo4_test {
    static void main(String[] args){
        demo4 a=new demo4("sakamoto",15);
        demo4 b=new demo4("nagumo",20);

        a.showRoleInfo();
        b.showRoleInfo();
        while(true){
            a.attack(b);
            if(b.getBlood()==0){
                System.out.println("game over");
                break;
            }
            b.attack(a);
            if(a.getBlood()==0){
                System.out.println("game over");
                break;
            }
        }


    }



}
