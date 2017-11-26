package twelve;

import org.junit.Test;

public class Exercise10 {
    public void f() throws A_Exception {
        System.out.println("inside f()");
        throw new A_Exception();
    }

    public void g() throws B_Exception {
        try {
            f();
        } catch (A_Exception e) {
            //exercise10
            //throw new B_Exception();

            //exercise11_1 非Error Exception RunTimeException 但是 Throwable的子类 可以使用initCause() 调出异常链
            //B_Exception b_exception = new B_Exception();
            //b_exception.initCause(e);
            //throw b_exception;

            //exercise11_2 直接使用new RuntimeException(e) 将异常e放入构造器中 生成异常链
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1() {
        //try {
        //    f();
        //} catch (A_Exception e) {
        //    e.printStackTrace();
        //}

        try {
            g();
        } catch (B_Exception e) {
            e.printStackTrace();
        }
    }
}

class A_Exception extends Exception {

}

class B_Exception extends Exception {

}