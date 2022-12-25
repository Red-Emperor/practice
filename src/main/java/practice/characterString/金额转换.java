package practice.characterString;

import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
//        把2135变成：零佰零拾零万贰仟壹佰叁拾伍元
//        把789变成：零佰零拾零万零仟柒佰捌拾玖元
        Scanner sc = new Scanner(System.in);
        int i;

        //1.键盘录入一个金额
        while (true) {
            System.out.println("请输入数字：");
            i = sc.nextInt();
            if (i >= 1 && i <= 9999999) {
                break;
            } else {
                System.out.println("非法数字！");
            }
        }

        //定义一个变量用来表示钱的大写
        StringBuilder zh = new StringBuilder();
        //得到i里面的每一位数字,再转成中文
        //从右往左获取数据，因为右侧是数据的个位
        while (true) {
            int i1 = i % 10;
            String capitalNumber = getCapitalNumber(i1);
            //把转换之后的大写拼接到zh当中
            zh = new StringBuilder(capitalNumber + zh);
//          如果数字上的每一位全部获取到了，那么i记录的就是0，此时循环结束循环结束
            i = i / 10;
            if (i == 0) {
                break;
            }
        }

//        在前面补0，补齐7位
        int count = 7 - zh.length();
        for (int i2 = 0; i2 < count; i2++) {
            zh.insert(0, "零");
        }

        //定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        //遍历zh,依次得到 零    零   零   贰   壹   叁   伍
        //然后把arr的单位插入进去
        StringBuilder result = new StringBuilder();
        for (int i3 = 0; i3 < zh.length(); i3++) {
            char c = zh.charAt(i3);
            //把大写数字和单位拼接到result当中
            result.append(c).append(arr[i3]);
        }

        //5.打印最终结果
        System.out.println(result);


    }

    //定义一个方法把数字变成大写的中文
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }

}
