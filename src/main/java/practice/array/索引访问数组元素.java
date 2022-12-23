package practice.array;

public class 索引访问数组元素 {
    public static void main(String[] args) {
        int [] age={11,22,13};
        int i = age[0];
        System.out.println(i);
        /* 获取数组1索引，并打印 */
        System.out.println(age[1]);
        age[2] =100;
        System.out.println(age[2]);
    }
}