package third;

import org.junit.Test;

/**
 * Created by 10170 on 2017/7/24.
 */
public class Random {

    //Math.Random

    @Test
    public void twoDifferentRandom() {
        int i = 0;
        System.out.println("Math.random生成随机数!");
        while (i < 3) {
            System.out.println("第" + i + "个数:" + Math.random());
            i++;
        }
        int j = 0;
        java.util.Random random = new java.util.Random();
        System.out.println("java.util.Random生成随机数!");
        while (j < 3) {
            System.out.println("第" + j + "个数:" + random.nextInt());
            j++;
        }
    }

    @Test
    public void RandomConstructor() {
        java.util.Random random1 = new java.util.Random(10);
        java.util.Random random1_sanmeseed = new java.util.Random(10);
        java.util.Random random2 = new java.util.Random();
        System.out.println("random1:" + random1.nextInt());
        System.out.println("random1_sanmeseed:" + random1_sanmeseed.nextInt());
        System.out.println("random2:" + random2.nextInt());
    }

    @Test
    public void testNextInt() {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("带bound参数方法生成的随机数:" + random.nextInt(2147483647));
            System.out.println("无参数方法生成的随机数:     " + random.nextInt());
        }
    }

    @Test
    public void testNextDouble() {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble());
        }
    }

    @Test
    public void getSpecifyDoubleRandom() {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            double num = random.nextDouble() * 15 - 3;
            System.out.println("[-3,12)之间的Double随机数:" + num);
        }
    }

//    public static void main(String[] args) {
//        //java.util.Random  有两种构造器 也就是带不带long类型的seed参数  seed是随机数的种子代表随机数的序列集合
//        //相同的seed的Random对象同时使用next***等方法时，若都无参或者参数相同的情况下 生成的随机数序列相同
//        //即在此情况下，按相同的顺序执行方法获取到的随机数相同!
//        java.util.Random random1 = new java.util.Random(10);
//        java.util.Random random2 = new java.util.Random();
//        int i = 10;
//        while (i > 0) {
//            //random.nextDouble 默认取值为[0,1)包括0，不含1的小数部分
//            //当获取[-3,12)之间的随机数,先将两边数字加3,使左边变为0,右边的数字为15,是1的15倍,所以先乘15 在减3
//            System.out.println("random1:" + (random1.nextDouble() * 15 - 3));
//            System.out.println("random2:" + random2.nextDouble());
//            System.out.println("------------------------------");
//
//            //random.getNext有两种方法 如下输出语句第一条为带参语句，输出的数字在[0,12)之间 第二条输出语句 不带限制在[0,n)之间
//            System.out.println("random1:" + random1.nextInt(12));
//            System.out.println("random2:" + random2.nextInt());
//            System.out.println("----------------------------");
//            i--;
//        }
//    }
}
