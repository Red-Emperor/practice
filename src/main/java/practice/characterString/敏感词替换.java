package practice.characterString;

public class 敏感词替换 {
    public static void main(String[] args) {
        String talk = "我操，原...原来你也玩原神！";
//        敏感词进行替换
        String talk1 = talk.replace("操", "*");
        System.out.println(talk);
        System.out.println(talk1);
    }

}
