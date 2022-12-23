package practice.ClassesAndObjects;

public class GirlFriendTest {

    public static void main(String[] args) {
        GirlFriend gfd = new GirlFriend();
//        GirlFriend gfd1 = new GirlFriend();
//        gfd.name = "三上悠亚";
//        gfd.age = 18;
//        gfd.height = 170;
//        gfd1.name = "迪丽热巴";
//        gfd1.age = 24;
//        gfd1.height = 168;

//        System.out.println(gfd.name);
//        System.out.println(gfd.age);
//        System.out.println(gfd.height);
//
//        System.out.println(gfd1.name);
//        System.out.println(gfd1.age);
//        System.out.println(gfd1.height);

//        赋值
        gfd.setName("三上悠亚");
        gfd.setAge(25);
        gfd.setHeight(168);

        System.out.println(gfd.getName());
        System.out.println(gfd.getAge());
        System.out.println(gfd.getHeight());


        gfd.SexualIntercourse();
//        gfd1.SexualIntercourse();


    }

}
