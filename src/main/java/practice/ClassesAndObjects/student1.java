package practice.ClassesAndObjects;

public class student1 {
    private String name;

//    如果不写构造方法,那么虚拟机自动生成一个空参构造方法
//    空参
//    public student1(){
//        System.out.println("执行");
//    }
//    有参
    public student1(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
