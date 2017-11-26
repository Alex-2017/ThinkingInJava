package tenth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10170 on 2017/10/24.
 */
public class Test {
    @org.junit.Test
    public void test1() {
        Outer_1 outer_1 = new Outer_1();
        System.out.println(outer_1.check());
    }

    @org.junit.Test
    public void test2() {
        Outer_1 outer_1 = new Outer_1();
        Outer_1.Inner inner = outer_1.new Inner();
    }

    @org.junit.Test
    public void test3() {
        int i = 4;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

    @org.junit.Test
    public void test4() {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list1);
        System.out.println(list2);
        list2.add("4");
        System.out.println(list1);
        System.out.println(list2);
    }
}

class Outer_1 {
    class Inner {
        //生成所在外部类的引用
        public Outer_1 getOuter_1() {
            return Outer_1.this;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    //验证外部类对象的引用与其内部类生成的外部类的引用是否相同
    public boolean check() {
        return this == getInner().getOuter_1();
    }
}


class A {

}