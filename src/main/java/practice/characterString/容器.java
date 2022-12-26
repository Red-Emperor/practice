package practice.characterString;

public class 容器 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
//        添加元素
        sb.append(1);
        sb.append("saodgf");
        //打印:因为StringBuilder是Java已经写好的类,java在底层对他做了一些特殊处理,打印对象不是地址值而是属性值
        System.out.println(sb);
//        反转
        sb.reverse();
        System.out.println(sb);
//        获取长度
        int length = sb.length();
        System.out.println(length);

    }
}
