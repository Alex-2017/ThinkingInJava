package twelve;

public class Test {

    public void f() throws Exception {
        System.out.println("inside f()");
        throw new Exception("Chapter 12-6");
    }

    @org.junit.Test
    public void test1() {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("message is " + e.getMessage());
            System.out.println("localMessage is " + e.getLocalizedMessage());
            System.out.println("e.toString is " + e);
            System.out.println("printStackTrace is ====");
            //e.printStackTrace() 和 e.printStackTrace(System.out)有着不同的输出结果 后者输出较为友好
            //e.printStackTrace();
            e.printStackTrace(System.out);
        }
    }

    public void a() {
        try {
            throw new Exception("Chapter 12-6");
        } catch (Exception e) {
            for (StackTraceElement smc : e.getStackTrace()) {
                System.out.println(smc.getMethodName());
            }
        }
    }

    public void b() {
        a();
    }

    public void c() {
        b();
    }

    //栈轨迹 由轨迹信息组成的数组 元素0是是指调用的最后一个元素（也是异常被创建和被抛出的地方） 最后的一个元素是指调用序列的第一个方法调用
    @org.junit.Test
    public void test2() {
        a();
        System.out.println("---------------------");
        b();
        System.out.println("---------------------");
        c();
    }

    @org.junit.Test
    public void test3() {
        try {
            throw new TestException();
        } catch (TestException e) {
            System.out.println("catch TestException");
            try {
                throw e;
            } catch (TestException e1) {
                System.out.println("catch Exception");
            }
        }
    }

}

class TestException extends Exception {

}
