package tenth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/23.
 */
public class Chapter10_3 {
    @Test
    public void test1() {
        DotThis dotThis = new DotThis();
        //.new 声明需要生成的对象类型 必须使用外部类的对象来创建对应的内部类对象
        DotThis.Inner inner = dotThis.new Inner();
        inner.getOutter().f();
    }
}

class DotThis{
    void f() {
        System.out.println("Dotthis.f()");
    }

    //.this的用法 生成对外部类对象的引用
    class Inner{
        public DotThis getOutter(){
            return DotThis.this;
        }
    }
}