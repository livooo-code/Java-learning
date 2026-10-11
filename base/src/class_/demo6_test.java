package class_;

import java.util.Scanner;

public class demo6_test {
    static void main(String[] args){
        demo6[] car=new demo6[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            demo6 a=new demo6();

            System.out.println("brand：");
            String brand=sc.next();
            a.setBrand(brand);
            System.out.println("price: ");
            int price=sc.nextInt();
            a.setPrice(price);
            System.out.println("color: ");
            String color=sc.next();
            a.setColor(color);

            car[i]=a;
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].getBrand()+" "
                    +car[i].getPrice()+" "
                    +car[i].getColor());
        }
    }
}
