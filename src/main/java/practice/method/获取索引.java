package practice.method;

public class 获取索引 {
    public static void main(String[] args) {
//        定义一个方法获取数字，在数组中的索引位置，将结果返回给调用处，如果有重复的，只要获取第一个即可。
        int [] arr = {1,2,3,4,5};
        boolean b = get(8, arr);
        System.out.println(b);

    }
    public static boolean get (int number,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(number == arr[i]){
                //如果相等，表示找到了
                return true;
            }
        }
        //当循环结束之后，如果还不能返回索引，表示数组中不存在该数据
        //可以返回-1
        return false;
    }
}
