package fifth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class UpCast {
    //public void f1(byte i) {
    //    System.out.println("f1(byte)");
    //}

    public void f1(short s){
        System.out.println("f1(short)");
    }

    //public void f1(int i) {
    //    System.out.println("f1(int)");
    //}

    public void f1(float f) {
        System.out.println("f1(float)");
    }

    //public
    @Test
    public void testf1() {
        byte b = 1;
        f1(b);
        char c = 'a';
        f1(c);
    }

}
