package class_;

public class demo9_test {
    static void main(String[] args){
        demo9 a=new demo9(12,"saka",18);
        demo9 b=new demo9(45,"nagumo",16);
        demo9 c=new demo9(23,"ani",21);

        demo9[] stu=new demo9[3];
        stu[0]=a;
        stu[1]=b;
        stu[2]=c;

        demo9 d=new demo9(46,"alan",12);

        demo9[] s =contains(stu,d);
        System.out.println("添加去重后的数组打印：");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getId()+" "
                    +s[i].getName()+" "
                    +s[i].getAge());
        }
        System.out.println();

        s=delStu(s,a);
        System.out.println("删除元素后的数组打印：");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getId()+" "
                    +s[i].getName()+" "
                    +s[i].getAge());
        }
        System.out.println();

        s=findX(s,b);
        System.out.println("查找后的打印：");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getId()+" "
                    +s[i].getName()+" "
                    +s[i].getAge());
        }

    }
    public static demo9[] contains(demo9[] s,demo9 x){
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == x.getId()) {
                System.out.println("error");
                return s;
            }
        }
        demo9[] news=new demo9[s.length+1];
        for (int i1 = 0; i1 < s.length; i1++) {
            news[i1]=s[i1];
        }
        news[news.length-1]=x;

        return news;
    }

    public static demo9[] delStu(demo9[] s,demo9 x) {
        int index=-1;
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == x.getId()) {
                index=i;
                break;
            }
        }
        if (index==-1) {
            System.out.println("error");
            return s;
        }
        demo9[] news = new demo9[s.length - 1];
        for (int i1 = 0; i1 < news.length; i1++) {
            news[i1] = s[i1];
        }
        for (int i = index+1; i <s.length ; i++) {
            news[i-1]=s[i];
        }
        return news;
    }

    public static demo9[] findX(demo9[] s, demo9 x) {
        boolean flag = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == x.getId()) {
                flag = true;
                s[i].setAge(s[i].getAge() + 1);
            }
        }
        if (!flag) {
            System.out.println("error");
        }
        return s;
    }
}




