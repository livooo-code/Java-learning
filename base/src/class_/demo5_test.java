package class_;

public class demo5_test {
    static void main(String[] args){
        demo5 a=new demo5("tw12","pencil",
                12.9,200);
        demo5 b=new demo5("jp34","erase",
                1.9,300);
        demo5 c=new demo5("us78","tv",
                3009.12,60);

        demo5[] arr={a,b,c};
        for (int i = 0; i < arr.length; i++) {
            demo5 goods=arr[i];
            System.out.print(goods.getName()+" "
                    +goods.getId()+" "
                    +goods.getPrice()+" "
                    +goods.getStock()
            );
            System.out.println();
        }
    }
}
