package practice.arraylist;

import java.util.ArrayList;

public class demo {
    /**
     * 案例：从集合中遍历元素且删除。
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);

        for (int i = list.size() - 1; i >= 0; i--) {
            Integer integer = list.get(i);
            if (integer < 80) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
