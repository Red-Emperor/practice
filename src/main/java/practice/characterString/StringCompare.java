package practice.characterString;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("avc");
        String s2 = "aVc";
//        比较地址
        System.out.println(s1 == s2);
//        比较内容
        boolean equals = s1.equals(s2);
        System.out.println(equals);
//        比较内容，忽略大小写(只能是英文）
        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println(b);


    }
}
