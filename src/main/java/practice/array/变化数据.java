package practice.array;

public class 变化数据 {
    public static void main(String[] args) {
        /*需求：

        定义一个数组，存储1,2,3,4,5,6,7,8,9,10

        遍历数组得到每一个元素。

        要求：

        1，如果是奇数，则将当前数字扩大两倍

        2，如果是偶数，则将当前数字变成二分之一*/
        int [] bh = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < bh.length; i++) {
            if(bh[i]%2 ==0) {
                bh[i] = bh[i] / 2;
            }else{
                bh[i] = bh[i]*2;
            }
            System.out.println(bh[i]);
        }
        }
}
