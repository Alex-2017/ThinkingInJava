package eighth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/9/30.
 */
//继承时构造器调用复写的方法，非常容易产生极大的BUG
public class Exercise15 {
    @Test
    public void test() {
        Base base = new Derived(10);
        base.write();
    }
}
class Base{
    public void write() {
        System.out.println("BaseClass Write()");
    }

    public Base() {
        System.out.println("Before write");
        write();
        System.out.println("After write");
        System.out.println("Base Constructor");
    }
}

class Derived extends Base {
    private int days;

    public Derived(int days) {
        this.days = days;
        System.out.println("Derived Constructor");
    }

    @Override
    public void write() {
        System.out.println("DerivedClass write "+ days);
    }
}