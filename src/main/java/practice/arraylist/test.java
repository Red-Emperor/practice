package practice.arraylist;

import java.util.ArrayList;

public class test {
    /**
     * 案例：集合存储自定义元素并遍历。
     * 需求：定义电影类（名称，分值，演员），创建3个电影对象，代表三部影片，存入集合中并遍历。
     * 《肖生克的救赎》, 9.7 , 罗宾斯
     * 《霸王别姬》, 9.6 , 张国荣、张丰毅
     * 《阿甘正传》, 9.5 , 汤姆.汉克斯
     */
    public static void main(String[] args) {
        ArrayList<movie> movies = new ArrayList<>();

        movies.add(new movie("《肖生克的救赎》", 9.7, "罗宾斯"));
        movies.add(new movie("《霸王别姬》", 9.6, "张国荣、张丰毅"));
        movies.add(new movie("《阿甘正传》", 9.5, "汤姆.汉克斯"));

        for (int i = 0; i < movies.size(); i++) {
            movie movie = movies.get(i);
            System.out.println("片名：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }


    }

}
