package sixth.test;

import org.junit.Test;
import sixth.debug.Connection;
import sixth.debug.ConnectionManger;
import sixth.debug.DeBug;


/**
 * Created by 10170 on 2017/9/7.
 */
public class Practice {
    @Test
    public void practice3() {
        //DeBug deBug = new DeBug();
        //deBug.debug();
        DeBug debug = new DeBug();
        debug.debug();
    }

    @Test
    public void practice5() {
        Practice5 practice5 = new Practice5();
        System.out.println(practice5.pub);
        System.out.println(practice5.pro);
        System.out.println(practice5.friendly);
        //System.out.println(practice5.pri);
    }

    @Test
    public void practice9() {
        Connection connection = ConnectionManger.getConnection();
        while (connection != null) {
            System.out.println(connection);
        }
    }

    //新建对象a1 随后新建对象a2 将a1设为null 输出a2 仍为a1之前的值 因为a2指向的是a1之前的地址值 a1的地址发生变化不会影响a2
    @Test
    public void test() {
        Address a1 = new Address(1);
        Address a2 = a1;
        a1 = null;
        System.out.println(a2);
    }
}

class Address{
    private int i;

    Address(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Address{" +
                "i=" + i +
                '}';
    }
}