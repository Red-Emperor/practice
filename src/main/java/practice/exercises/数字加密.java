package practice.exercises;

import java.util.Scanner;

public class 数字加密 {
    public static void main(String[] args) {
        /*
        某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
            每位数加上5
            再对10求余，
            最后将所有数字反转，
            得到一串新数。
*/
        while (true) {
            int[] arr1 = getArr();
            int encrypt = encrypt(arr1);
            System.out.println(encrypt);
        }


    }


    //    把数字加到数组
    public static int[] getArr() {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入数字");
        int number = sr.nextInt();
        int temp = number;
        int count = 0;

//       获取数字长度
        while (number != 0) {
            //每一次循环就去掉右边的一个数字
            number = number / 10;
            //去掉一位计数器就自增一次。
            count++;
        }

        //2.定义数组
        int[] arr = new int[count];
        //3.把整数上的每一位都添加到数组当中
        int index = arr.length - 1;
        while (temp != 0) {//12345
            //获取temp里面的每一位数组
            int ge = temp % 10;
            //再去掉右边的那位数字
            temp = temp / 10;
            //把当前获取到的个位添加到数组当中
            arr[index] = ge;
            index--;
        }

        return arr;
    }

    //    加密
    public static int encrypt(int[] arr1) {

        //每位数加上5
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] + 5;
        }

        //再对10求余，
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] % 10;
        }

        //将所有数字反转
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }

        //把数组里面的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr1.length; i++) {
            number = number * 10 + arr1[i];
        }
        return number;
    }
}
