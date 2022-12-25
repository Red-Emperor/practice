package practice.characterString;

import java.util.Scanner;

public class 手机号屏蔽 {
    public static void main(String[] args) {
//        需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
//        最终效果为：`131****9468`
        //1.键盘录入一个手机号码
        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号：");
            phoneNumber = sc.next();
            int length = phoneNumber.length();
            if (length == 11) {
                break;
            } else {
                System.out.println("手机号错误！");
            }
        }


//        截取手机号码中的前三位 包头不包尾，开始的位置使用，末尾的实际位置为 末尾——1
        String start = phoneNumber.substring(0, 3);
//        截取手机号码中的最后四位
//        //此时我用substring方法，是用1个参数的，还是两个参数的？1个参数的会更好
//        //因为现在我要截取到最后，所以建议使用1个参数的。
        String end = phoneNumber.substring(7);
        System.out.println(start + "****" + end);
    }
}
