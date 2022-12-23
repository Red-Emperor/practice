package practice.method;

public class 比较面积大小 {
    public static void main(String[] args) {
        int area = s(14, 6);
        int area1 = s(14, 23);

        if(area>area1) {
            System.out.println("第一个大");
        }else{
            System.out.println("第二个大");
        }

    }
    public static int s(int x, int y) {
        int area = x *y;
        return area;
    }
}
