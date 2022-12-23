package practice.ClassesAndObjects;

public class GirlFriend {
    private String name;
    private int height;
    private int age;

    //为name提供get、set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //为age提供get、set方法
    public void setAge(int age) {
        if (age >= 16 && age <= 35) {
            this.age = age;
        } else {
            System.out.println("不能做女朋友");
        }
    }

    public int getAge() {
        return age;
    }

    //为height提供get、set方法
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void SexualIntercourse() {
        System.out.println("気持ちいいです");
    }


}
