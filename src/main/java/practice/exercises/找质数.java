package practice.exercises;

public class 找质数 {
    public static void main(String[] args) {
        //判断 101 ~ 200 之间有多少个素数，并打印所有素数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                //全部执行完都没有走if语句，则flag仍为true，表示是质数，如果i是质数，flag为false，并跳出循环，不在继续执行
                if (i % 2 == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println("101到200间共有：" + count + "个质数");
    }
}
