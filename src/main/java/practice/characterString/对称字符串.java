package practice.characterString;

import java.util.Scanner;

public class 对称字符串 {
    public static void main(String[] args) {
//        需求:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
//        对称字符串（正过来，反过来都一样）：123321、111
//        非对称字符串：123123
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.next();
//        反转键盘录入的字符串
        String s1 = new StringBuilder().append(s).reverse().toString();

        if (s.equals(s1)) {
            System.out.println("当前字符串是对称字符串");
        } else {
            System.out.println("当前字符串不是对称字符串");
        }


    }
}
