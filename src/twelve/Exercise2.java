package twelve;

import org.junit.Test;

public class Exercise2 {
    //异常处理理论上有两种模型 1.终止模型 2.恢复模型
    //终止模型 抛出异常 程序无法继续正常执行
    //恢复模型 扑捉异常 程序正常执行

    //终止模型
    @Test
    public void test1() {
        Exercise2 exercise2 = null;
        exercise2.toString();
        System.out.println("启用了终止模型，无法看到此条消息输出");
    }

    //恢复模型
    @Test
    public void test2() {
        Exercise2 exercise2 = null;
        try {
            System.out.println(exercise2.getClass());
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        System.out.println("如果抛出的异常被扑捉到了，就会看到这条信息");
    }
}
