package practice.method;

public class 数组最大值 {
    public static void main(String[] args) {
//        需求：设计一个方法用于获取数组中元素的最大值
        int [] arr = {1,2,3,4,5,6,7,8};
        int max = getMax(arr);
        System.out.println();
        System.out.println(getMax(arr));


    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
               max = arr[i];
            }
        }
        return max;
    }

}
