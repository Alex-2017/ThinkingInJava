package tenth.exercise6_2;

import tenth.exercise6_1.SimpleInterface;

/**
 * Created by 10170 on 2017/10/25.
 */
public class SimpleClass {
    protected class Inner implements SimpleInterface {
        @Override
        public void f() {
            System.out.println("I'm Inner Class");
        }

        //内部类的构造函数和内部类拥有相同的访问属性(默认是protected的),若要让SimpleClass的子类创建Inner的实例,需要新建Inner构造器的构造器,设置为public
        public Inner() {

        }
    }

    protected String label = "test";
}
