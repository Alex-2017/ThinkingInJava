package tenth.exercise6_3;

import tenth.exercise6_2.SimpleClass;

/**
 * Created by 10170 on 2017/10/25.
 */
public class SimpleClassChild extends SimpleClass{
    public static void main(String[] args){
        SimpleClassChild simpleClassChild = new SimpleClassChild();
        //内部类的构造器默认与内部类有相同的访问属性  若要创建其实例 添加 public Inner() {}
        Inner inner = simpleClassChild.new Inner();
        inner.f();
    }
}
