package nine;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class Exercise3 {
    @Test
    public void exercise3() {
        Derived derived = new Derived();
        derived.print();
    }
}
abstract class Base{
    public abstract void print();

    public Base() {
        print();
    }
}

class Derived extends Base{
    int i = 100;

    @Override
    public void print() {
        System.out.println("Derived Print i = "+i);
    }
}