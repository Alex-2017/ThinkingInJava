package fourth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/8/23.
 */
public class Practice {
    @Test
    public void practice1() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void practice2() {
        int looptime = 24;
        compareRandom(looptime);
    }

    @Test
    public void practice3() {
        int looptime = Integer.MAX_VALUE;
        compareRandom(looptime);
    }

    //生成random个随机数 进行looptime次比较 第一个random 与 随后的random 进行比较
    private void compareRandom(int looptime) {
        int i = 0;
        java.util.Random random = new java.util.Random();
        int random1 = random.nextInt();
        int random2 = random.nextInt();
        while (i < looptime) {
            System.out.print(i + 1 + "次循环===========  ");
            if (random1 > random2) {
                System.out.println(random1 + ">" + random2);
            } else if (random1 == random2) {
                System.out.println(random1 + "=" + random2);
            } else {
                System.out.println(random1 + "<" + random2);
            }
            random1 = random2;
            random2 = random.nextInt();
            i++;
        }
    }

    @Test
    public void practice4() {
        int number = 100;
        getPrimeNumber(number);
    }

    //探测 num 到 0之间的素数
    private void getPrimeNumber(int num) {
        boolean flag;
        for (int i = 1; i <= num; i++) {
            flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i + "为素数");
            }
        }
    }

    @Test
    public void bestGetPrime() {

    }

    //逗号操作符 仅存在与for循环语句中的变量初始化和步进控制部分(如 i++)
    @Test
    public void commaOperatorDemo() {
        for (int i = 0, j = 10; i < 5; i++, j = j * i) {
            System.out.println("i:" + i + "---j:" + j);
        }
    }

    @Test
    public void practice6() {
        System.out.println(isNumInRange(1, 2, 3));
        System.out.println(isNumInRange(2, 2, 3));
        System.out.println(isNumInRange(3, 1, 3));
    }

    private boolean isNumInRange(int num, int begin, int end) {
        return num >= begin && num <= end;
    }

    @Test
    public void practice7_1() {
        int i = 1;
        while (true) {
            if (i == 100)
                break;
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void practice7_2() {
        int i = 1;
        while (true) {
            if (i == 100)
                return;
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void practice8_1() {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                case 4:
                    System.out.println(i);
                    break;
            }
        }
    }

    @Test
    public void practice8_2() {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(i);
                case 1:
                    System.out.println(i);
                case 2:
                    System.out.println(i);
                case 3:
                    System.out.println(i);
                case 4:
                    System.out.println(i);
            }
        }
    }

    @Test
    public void practice9() {
        getFibonacci(10);
    }

    //输出num个斐波那契数列
    private void getFibonacci(int num) {
        if (num > 0) {
            if (num == 1)
                System.out.print(1);
            else if (num == 2)
                System.out.print(1 + " " + 2 + " ");
            else {
                int a = 1;
                int b = 1;
                int total;
                System.out.print(a + " " + b + " ");
                for (int i = 0; i < num - 2; i++) {
                    total = a + b;
                    System.out.print(total + " ");
                    a = b;
                    b = total;
                }
            }
        } else {
            System.out.println("输入数字不合法!");
        }
    }

    //practice9 答案
    static int getF_Num(int n){
        if (n <= 2) {
            return 1;
        }else{
            return getF_Num(n - 2) + getF_Num(n - 1);
        }
    }
    @Test
    public void practice9_answer() {
        for(int i=1;i<=10;i++) {
            System.out.print(getF_Num(i)+" ");
        }
    }

}
