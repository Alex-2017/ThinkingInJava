package tenth;

import org.junit.Test;

public class Exercise23 {
    @Test
    public void test1() {
        A_1 a_1 = new A_1();
        B_1 b_1 = new B_1(10);
        for (int i = 0; i < 10; i++) {
            b_1.addU(a_1.getU());
        }
        b_1.circurUARR();
        System.out.println();
        b_1.changeUarr(2);
        b_1.circurUARR();
    }

    @Test
    public void test2() {
        System.out.println(System.nanoTime());
    }
}

interface U {
    void a();

}

class A_1 {
    public U getU() {
        return new U() {

            @Override
            public void a() {
                System.out.println("A_1.U.a()----");
            }
        };
    }
}

class B_1 {
    private int index = 0;
    private U[] uArr;

    public B_1(int length) {
        uArr = new U[length];
    }


    public void addU(U u) {
        if (index < uArr.length) {
            uArr[index] = u;
            index++;
        }
    }

    public void changeUarr(int i) {
        uArr[i] = null;
    }

    public void circurUARR() {
        for (U u : uArr) {
            System.out.println(u);
        }
    }
}
