package nine;

/**
 * Created by 10170 on 2017/10/19.
 */
public class Exercise17 {
    public static void main(String[] args){
        //无需创建实例 即可访问color变量 证明变量为static类型
        System.out.println(exer17.color);
    }
}
//证明接口中变量是static和final的

interface exer17 {
    String color = "RED";
}

//证明 final
class imple implements exer17 {
    void test() {
        //提示 Cannot assign a value to final variable 'color‘
        //color = "BLUE";
    }
}

//
interface innerInerface {
    void method_1();

    interface inter1 {
        void method_2();
    }

    // 在接口中声明的接口不能声明为 private 提示 Illegal combination of modifiers: 'private' and 'public'
    //private interface inter2 {
    //}
}

//实现某个接口时 不需要实现其内嵌套的接口方法 method_2并未被要求实现
class imple2 implements innerInerface {
    @Override
    public void method_1() {

    }
}
