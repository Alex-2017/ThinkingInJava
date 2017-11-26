package twelve;

import org.junit.Test;

public class Exercise28 {
    //根据Exercise4进行更改
    public static void f() {
        Exercise28Exception exception = new Exercise28Exception("Hi Therer");
        throw new RuntimeException(exception);
    }

    @Test
    public void test1() {
        //将异常放入之后RuntimeException 不再需要try-catch语句
        f();
    }

    @Test
    public void test2() {
        //RuntimeException中可以添加自定义信息
        throw new RuntimeException("这里面可以放信息吗");
    }

    //将多个Exception放入RuntimeException中 通过initCause()连接异常之间的信息
    public static void t() {
        try {
            f();
        } catch (RuntimeException e) {
            e.initCause(new CustomException("CustomException"));
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test3() {
        t();
    }



}

class Exercise28Exception extends Exception {
    Exercise28Exception(String string) {
        super(string);
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}