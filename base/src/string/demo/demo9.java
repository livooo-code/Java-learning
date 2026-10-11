package string.demo;

public class demo9 {
    static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //添加内容大于16会扩容到34=16*2+2(即原来的容量*2+2)
        sb.append("456456s4gsd64hs6h456sh46223333333333");

        //若一次添加的内容大于34，以实际长度为准
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.length());

    }
}
