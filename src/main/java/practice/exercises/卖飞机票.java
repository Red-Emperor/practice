package practice.exercises;

import java.util.Scanner;

public class 卖飞机票 {
    public static void main(String[] args) {
         /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/

//分析：
        //1.键盘录入机票原价、月份、头等舱或经济舱

        for (int i = 0; i < 3; i++) {
            Scanner sr = new Scanner(System.in);
            System.out.println("请输入机票的原价");
            int ticket = sr.nextInt();
            System.out.println("请输入机票的月份");
            int month = sr.nextInt();
            System.out.println("请输入0头等舱 或 1经济舱");
            int seat = sr.nextInt();
            ticket = getTicket(ticket, month, seat);
            System.out.println(ticket);
        }
    }

    private static int getTicket(int ticket, int month, int seat) {
        if (month <= 10 && month >= 5) {
            if (seat == 0) {
                ticket *= 0.9;
            } else if (seat == 1) {
                ticket *= 0.85;
            }

        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            if (seat == 0) {
                ticket *= 0.7;
            } else if (seat == 1) {
                ticket *= 0.65;
            }

        }
        return ticket;
    }
}
