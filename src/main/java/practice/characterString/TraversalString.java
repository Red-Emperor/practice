package practice.characterString;

import java.util.Scanner;

public class TraversalString {
    public static void main(String[] args) {
//        键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        //两个方法：
        //charAt()：会根据索引获取对应的字符
        //length(): 会返回字符串的长度

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        //2.遍历
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
