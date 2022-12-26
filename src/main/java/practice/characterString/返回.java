package practice.characterString;

public class 返回 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        字符串相加
        sb.append("background".repeat(2));
        System.out.println(sb);
//        返回字符串
        String s = sb.toString();
        System.out.println(s);
    }

}
