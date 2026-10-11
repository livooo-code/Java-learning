package class_;

public class demo3 {
    private String name;
    private String code;
    private String email;
    private String gender;
    private int age;


//插件 ptg

    public demo3() {
    }

    public demo3(String name, String code, String email, String gender, int age) {
        this.name = name;
        this.code = code;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if (age < 0) {
            System.out.println("Error");
        } else {
            this.age = age;
        }}
}




