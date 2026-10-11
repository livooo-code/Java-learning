package class_;

public class demo8_test {
    static void main(String[] args){
        demo8 a=new demo8("saka",27,
                "m","sleep");
        demo8 b=new demo8("nagu",30,
                "m","work");
        demo8 c=new demo8("mamimi",18,
                "w","write");
        demo8 d=new demo8("ani",21,
                "w","fight");

        demo8[] role={a,b,c,d};
        int sum=0;
        for (int i = 0; i < role.length; i++) {
            sum+=role[i].getAge();
        }
        int avg=sum/ role.length;
        int count=0;
        for (int i = 0; i < role.length; i++) {
            if(role[i].getAge()<avg){
                count++;
                System.out.println(role[i].getName()+" "
                        +role[i].getAge()+" "
                        +role[i].getGender()+" "
                        +role[i].getHobby());
            }
        }
        System.out.println("total: "+count);
    }
}
