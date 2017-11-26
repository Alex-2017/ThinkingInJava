package eleven;

import org.junit.Test;

import java.util.*;

public class ModifyingArraysAsList {
    Random random = new Random(47);
    Integer[] integers = {1,2,3,4,5,6,7,8,9,10};

    @Test
    public void test1() {
        //Arrays.asList产生的对象传递给了ArrayList的构造器，这将创建一个引用integers的ArrayList 所以对此ArrayList的操作不会影响到底层数组
        List<Integer> list1 = new ArrayList<>(Arrays.asList(integers));
        System.out.println("Before shuffle");
        System.out.println(list1);
        System.out.println("After shuffle");
        Collections.shuffle(list1,random);
        System.out.println(list1);
        System.out.println("Original Array");
        System.out.println(Arrays.toString(integers));

    }

    @Test
    public void test2() {
        //直接引用了Arrays.asList产生的List，所以对该ArrayList产生的操作会直接影响到integers数组
        List<Integer> list1 = Arrays.asList(integers);
        System.out.println("Before shuffle");
        System.out.println(list1);
        System.out.println("After shuffle");
        Collections.shuffle(list1,random);
        System.out.println(list1);
        System.out.println("Original Array");
        System.out.println(Arrays.toString(integers));
    }
}
