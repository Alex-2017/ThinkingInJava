package nine;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class Exercise4 {
    public void noAbstract(NoAbstractMethod noAbstractMethod) {
        //需要向下转型
        ((Extend_1)noAbstractMethod).code();
    }

    public void withabstract(WithAbstractMethod withAbstractMethod) {
        //不需要向下转型
        withAbstractMethod.code();
    }

    @Test
    public void exercise4() {
        NoAbstractMethod extend_1 = new Extend_1();
        WithAbstractMethod extend_2 = new Extend_2();
        noAbstract(extend_1);
        withabstract(extend_2);
    }
}
abstract class NoAbstractMethod{}

class Extend_1 extends NoAbstractMethod {
    public void code() {
        System.out.println("extend_1.code()");
    }
}


abstract class WithAbstractMethod{
    abstract void code();
}

class Extend_2 extends WithAbstractMethod {

    @Override
    void code() {
        System.out.println("extend_2.code()");
    }
}