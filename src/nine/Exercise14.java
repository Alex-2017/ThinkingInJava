package nine;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/12.
 */
public class Exercise14 {
    public void a(A a) {
        a.a_1();
        a.a_2();
    }
    public void b(B b) {
        b.b_1();
        b.b_2();
    }
    public void c(C c) {
        c.c_1();
        c.c_2();
    }
    public void combine(CombineClass combine) {
        combine.combine();
    }

    @Test
    public void exercise14() {
        Target target = new Target();
        a(target);
        b(target);
        c(target);
        combine(target);
        target.base();
    }
}
interface A{
    void a_1();

    void a_2();
}

interface B{
    void b_1();

    void b_2();
}

interface C{
    void c_1();

    void c_2();
}

interface CombineClass extends A,B,C{
    void combine();
}

class BaseClass{
    public void base(){
        System.out.println("BaseClass.base()");
    }
}

class Target extends BaseClass implements CombineClass{

    @Override
    public void a_1() {
        System.out.println("a_1");
    }

    @Override
    public void a_2() {
        System.out.println("a_2");
    }

    @Override
    public void b_1() {
        System.out.println("b_1");
    }

    @Override
    public void b_2() {
        System.out.println("b_2");
    }

    @Override
    public void c_1() {
        System.out.println("c_1");
    }

    @Override
    public void c_2() {
        System.out.println("c_2");
    }

    @Override
    public void combine() {
        System.out.println("combine");
    }
}