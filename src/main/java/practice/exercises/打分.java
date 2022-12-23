package practice.exercises;

import java.util.Scanner;

public class 打分 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        int[] score = ScorePoints();
        int max = FindTheHighestScore(score);
        int min = FindTheLowestScore(score);
        int sum = sum(score);
        int avg = (sum - max - min) / (score.length - 2);
        System.out.println(avg);


    }

    //    获取分数
    public static int[] ScorePoints() {
        int[] fenShu = new int[6];
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < fenShu.length;) {
            System.out.println("请输入分数：");
            int score = sr.nextInt();
//如果分数合法，I++,把分数改入数组的后面元素，如果分数不合法，就继续运行把分数改入数组的第一个元素。
            if (score <= 100 && score >= 1) {
                fenShu[i] = score;
                i++;
            }
        }
        return fenShu;
    }

    //    求最低分
    public static int FindTheLowestScore(int[] score) {
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    //    求最高分
    public static int FindTheHighestScore(int[] score) {
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }

    //    总分
    public static int sum(int[] score) {
        int sum = 0;
        for (int j : score) {
            sum += j;
        }
        return sum;
    }

}
