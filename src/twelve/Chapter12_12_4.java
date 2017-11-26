package twelve;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Chapter12_12_4 {
    //在大型项目设计中 java编程思想作者认为 java的异常强制处理机制 会导致异常的丢失 给出了这种将Exception(受检查异常)转换为RunTimeException(不受检查异常)
    @Test
    public void test1() {
        WrapCheckedException wrap = new WrapCheckedException();
        wrap.throwRuntimeException(3);
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3) {
                    wrap.throwRuntimeException(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                System.out.println("twelve.SomeOtherException" + e);
            } catch (RuntimeException e) {
                //获取RunTimeException中的异常
                try {
                    throw e.getCause();
                } catch (FileNotFoundException fileException) {
                    System.out.println("FileNotFoundException " + fileException);
                } catch (IOException ioException) {
                    System.out.println("ioException " + ioException);
                } catch (Throwable throwable) {
                    System.out.println("throwable " + throwable);
                }
            }
        }
    }

    public static void main(String[] args) {

    }

}

class SomeOtherException extends Exception {

}

//将受检查的异常包装为不受检查的异常(RuntimeException)
class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();//抛出异常 不需要break；
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("where i am");
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}