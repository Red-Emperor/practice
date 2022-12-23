package practice.ClassesAndObjects;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

//    赋值
        p.brand="asofj";
        p.price=1345;
        System.out.println(p.brand);
        System.out.println(p.price);

//        调用方法
        p.call();

    }



}
