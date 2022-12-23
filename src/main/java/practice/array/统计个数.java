package practice.array;

public class 统计个数 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存储1,2,3,4,5,6,7,8,9,10

        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/
        int [] test = {1,2,3,4,5,6,7,8,9,10};
        int count=0;
        for (int i = 0; i < test.length; i++) {
            if(test[i]%3 ==0 ){
                count++;
            }

        }
        System.out.println("能被3整除的有"+count+"个");
    }
}
