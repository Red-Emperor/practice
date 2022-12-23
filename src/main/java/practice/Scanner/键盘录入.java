package practice.Scanner;

import java.util.Scanner;

public class 键盘录入 {
    public static void main(String[] args) {
//        创建对象 在这个格式里age是变量名，可以变，其他都不能变
        Scanner age = new Scanner(System.in);
        System.out.println("请输入数字");
//        接受数据 在这个格式里i是变量名，可以变，其他都不能变
        int i = age.nextInt();
        System.out.println(i);
    }
}
