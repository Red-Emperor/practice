package practice.variable;

public class 求质数 {
    public static void main(String[] args) {

        int i =7;
        //借助flag标记判断
        boolean flag = true;
//        求质数
        for(int j=2;j<i;j++){
            //全部执行完都没有走if语句，则flag仍为true，表示是质数，如果i是质数，flag为false，并跳出循环，不在继续执行
            if(i%j==0){
                flag=false;
                break;
            }
        }
        //这里用到了三元表达式，判断flag，并输出
        System.out.println(i+(flag?"是":"不是")+"质数");


    }
}
