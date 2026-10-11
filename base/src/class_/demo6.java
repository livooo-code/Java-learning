package class_;
//键盘录入：
//1.遇到空格、制表符、回车会停止接受
//eg:键入“abc bcd”，则第一次接受abc，第二次直接接受bcd，不允许再次录入
//整数：nextInt()
//小数：nextDouble()
//字符串：next()
//2.只有遇到回车会停止接受
//字符串：nextLine()
//两套体系不能混用
public class demo6 {
    private String brand;
    private int price;
    private String color;

    public demo6() {
    }

    public demo6(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
