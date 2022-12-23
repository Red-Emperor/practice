package practice.method;

public class 带返回值方法 {
    public static void main(String[] args) {
//        直接调用
        int getSum = getsum(4, 1);
//        赋值调用
        int returns = getsum(23,54);
        System.out.println(returns);
//        输出调用
        System.out.println(getsum(23,54));

    }

    public static int getsum (int a, int b) {
        return a + b;
    }

}




