package practice.variable;

import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
//        计数器
        int count = 0;
//        创建对象
        Random r = new Random();
//        生成随机数
        int i = r.nextInt(100) + 1;
        Scanner  sc = new Scanner(System.in);
        System.out.println("亲输入一个数字");
        while (true) {
            int number = sc.nextInt();
            count++;
            if (count==10){
                System.out.println("猜对了");
            }
            if (number>i){
                System.out.println("大了");
            } else if (number<i) {
                System.out.println("小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }

    }
}
