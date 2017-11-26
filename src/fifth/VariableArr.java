package fifth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class VariableArr {
    public void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
    }

    public void printArray_2(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
    }

    @Test
    public void test1() {
        printArray(new Object[]{"111", "222", "333", 'a', 444, 555});
        System.out.println();
        printArray_2("aaa", "bbb", "qqq", 'a', 1, 3, 4);
    }
}


