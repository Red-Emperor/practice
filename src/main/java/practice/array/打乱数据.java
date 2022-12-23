package practice.array;

import java.util.Random;

public class 打乱数据 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Random a = new Random();
        int b = a.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int temp =arr[i];
            arr[i] =arr[b];
            arr[b] =temp;
            System.out.print(arr[i]+" ");
        }

    }
}
