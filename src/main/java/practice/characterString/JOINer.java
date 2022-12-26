package practice.characterString;

import java.util.StringJoiner;

public class JOINer {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        String add = sj.add("a".repeat(3)).toString();
        System.out.println(add);
    }
}
