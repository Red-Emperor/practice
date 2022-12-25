package practice.characterString;

public class String {
    public String(java.lang.String abc) {

    }

    public String(java.lang.String[] chs) {

    }

    public String() {

    }

    public static void main(String[] args) {
//        直接赋值的方式创建字符串对象
        java.lang.String s = "abc";
        System.out.println(s);

//        使用new的方式
//        空参
        String s1 = new String();
        System.out.println("s" + s1 + "b");

//        传递一个字符串,根据传递的字符串内容在创建一个新的字符串
        String s2 = new String("abc");
        System.out.println(s2);

        //public String(char[] chs)：根据字符数组的内容，来创建字符串对象
        java.lang.String[] chs={"a","b","c"};
        String s3=new String(chs);
        System.out.println(s3);

        //public String(byte[] bys)：根据字节数组的内容，来创建字符串对象
//        场景：网络传输数据都是字节信息
        byte[] bytes={98,78,32};
        String s4=new String(java.lang.String.valueOf(bytes));
        System.out.println(s4);



    }


}
