package class_;

import java.util.Random;

public class demo4 {
    private String user;
    private int blood;
    private String job;

    String[] joboffer={"killer","boss","employee"
    ,"actor"};

    public demo4() {}

    public demo4(String user, int blood) {
        this.user = user;
        this.blood = blood;
        setJob();
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getJob() {
        return job;
    }

    public void setJob() {
        Random r =new Random();
        int index=r.nextInt(joboffer.length);
        this.job = joboffer[index];
    }

    public void attack(demo4 a){
        Random r=new Random();
        int hurt=r.nextInt(21);
        int remain=a.getBlood()-hurt;
        remain=remain < 0 ? 0 : remain;
        a.setBlood(remain);
        System.out.println(this.getUser()+"对"
                +a.getUser()+ "造成"+hurt+"点伤害"
                + ","+a.getUser()+"还剩下"+remain+"点血量");
    }

    public void showRoleInfo(){
        System.out.print("name:"+getUser()+" ");
        System.out.print("blood:"+getBlood()+" ");
        System.out.print("job:"+getJob()+" ");
        System.out.println();
    }
}

