package practice.array;

public class 求和 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存储1,2,3,4,5

        遍历数组得到每一个元素，求数组里面所有的数据和*/
        int [] age ={11,22,13,15,23,33,45};
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        System.out.println(sum);
    }
}
