package practice.circulation;

import java.util.Scanner;

public class 求平方根 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = sr.nextInt();
        for(int j = 1; j < i; j++) {
            if(j*j==i) {
                System.out.println(j+"就是"+i+"的平方根");
                break;
            }else if(j*j>i) {
                System.out.println((j-1)+"就是"+i+"的平方根");
                break;
            }
        }
    }
}
