package class_;

public class demo7_test {
    static void main(String[] args){
        demo7 a=new demo7("apple",5000,"black");
        demo7 b=new demo7("xiaomi",2000,"blue");
        demo7 c=new demo7("huawei",2356,"red");

        demo7[] phone={a,b,c};
        int sum=0;
        for (int i = 0; i < phone.length; i++) {
            sum+=phone[i].getPrice();
        }
        int avg=sum/ phone.length;

        System.out.println("avg:"+avg);
    }


}
