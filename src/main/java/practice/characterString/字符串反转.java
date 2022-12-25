package practice.characterString;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
//      定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//	    例如，键盘录入 abc，输出结果 cba
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        String result = reverse(str);
        System.out.println(result);


    }

    public static String reverse(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
