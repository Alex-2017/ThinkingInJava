package tenth;

import org.junit.Test;

public class Exercise26 {
    @Test
    public void test1() {
        WithInner withInner = new WithInner();
        WithInner_1 withInner_1 = new WithInner_1();
        WithInner_1.Inner_1 inner_1 = withInner_1.new Inner_1(withInner, "123");
        inner_1.f();
        WithInner_1.Inner_1 inner_2 = withInner_1.new Inner_1("456");
        inner_2.f();
    }
}


class WithInner {
    class Inner {
        String morning;
        public Inner(String str) {
            this.morning = str;
        }

        public void f() {
        }
    }

}

class WithInner_1 {
    //继承内部类的两种写法 均需提供所继承内部类的外部类实例
    class Inner_1 extends WithInner.Inner {
        private String string;

        public Inner_1(WithInner inner,String str) {
            //注意这句代码的语法
            inner.super(str);
            this.string = str;
        }

        public Inner_1(String str) {
            new WithInner().super(str);
            this.string = str;
        }

        @Override
        public void f() {
            super.f();
            System.out.println("Inner_1.f()----"+string);
        }
    }
}