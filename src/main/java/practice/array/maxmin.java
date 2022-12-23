package practice.array;

public class maxmin {
    public static void main(String[] args) {
//        需求：求数组中的最大值
        int [] m ={33,5,22,44,55};
        int  max=m[1];
        int  min=m[1];
        for (int i = 0; i < m.length; i++) {
            if(max<m[i]) {
                max=m[i];
            }else if(min>m[i]) {
                min=m[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
