package practice.variable;

public class 一到一百的质数 {
    public static void main(String[] args) {
        for (int q = 1; q < 101; q++) {
//循环判断1-100是否是质数
            if (q > 1) {
                //只有在大于1的情况下才开始进行质数的判断
                boolean flag = true;
                //借助标签，筛选是质数的数
                for (int i = 2; i < q; i++) {
                    if (q % i == 0) {
                        flag = false;
                        break;
                    }
                }
                //判断质数的循环完成以后，只输出 是质数的q
                if (flag) {
                    System.out.println(q + "是质数");
                }
            }
        }

    }
}
