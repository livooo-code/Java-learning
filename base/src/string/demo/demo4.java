package string.demo;

public class demo4 {
    static void main(String[] args){
        //string substring(int beginIndex,int endIndex)
        //截取字符串：包头不包尾，包左不包右
        //string substring(int beginIndex):默认截取到末尾

        String phoneNum="13197240528";
        String temp="****";
        String secretNum=phoneNum.substring(0,3)+temp+phoneNum.substring(7,11);
        System.out.println(secretNum);


        String code="431126199711214251";
        String birth=code.substring(6,10)+"年"+code.substring(10,12)+"月"+code.substring(12,14)+"日";

        System.out.println(birth);
        char gender=code.charAt(16); //值为ASCII码表中的53
        if((gender-48)%2==0){
            System.out.println("性别：女");
        }else{
            System.out.println("性别：男");
        }
    }
}
