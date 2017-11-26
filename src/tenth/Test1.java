package tenth;

/**
 * Created by 10170 on 2017/10/24.
 */
public class Test1 {
    @org.junit.Test
    public void test1() {
        Outer_2 outer_2 = new Outer_2();
        Outer_2.Inner inner = outer_2.new Inner();
        inner.inner();
    }
}

class Outer_2 {
    class Inner{
        public void inner() {
            System.out.println("this is Inner.inner method");
        }
    }
}