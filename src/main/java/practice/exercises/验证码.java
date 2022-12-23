package practice.exercises;

import java.util.Random;

public class 验证码 {
    public static void main(String[] args) {
        /*   需求：
            定义方法实现随机产生一个5位的验证码
            验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字
     */
        //        生成字母
        char[] string = new char[52];
        for (int i = 0; i < string.length; i++) {
            if (i <= 25) {
                string[i] = (char) (97 + i);
            } else {
                string[i] = (char) (65 + i - 26);//改大写应该是65+1,。此时i=26，表达式65+i=65+26。所以-26就可以转换大写A、B...
            }
        }
        //        生成验证码
        Random r = new Random();
        int number = r.nextInt(10);
        String Verificationcode = "";
        for (int i = 0; i < 4; i++) {
            int ys = r.nextInt(52);
            Verificationcode += string[ys];
        }
        Verificationcode += number;
        System.out.println(Verificationcode);

    }
}
