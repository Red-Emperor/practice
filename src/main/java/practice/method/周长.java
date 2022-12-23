package practice.method;

public class 周长 {
    public static void main(String[] args) {
        perimeter(18,66);
    }
    public static void perimeter(int length,int width){
        int perimeter = (length + width) * 2;
        System.out.println(perimeter);
    }
}
