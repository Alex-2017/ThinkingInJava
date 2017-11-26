package eleven;

import org.junit.Test;

import java.util.*;

public class Chapter11_3_1 {
    @Test
    public void test1() {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] integers = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(integers));
        //Collections.addAll()方法运行起来较快
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection, integers);
        System.out.println(collection);
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        //当直接使用Arrays.asList()转换得到的list 其底层仍然是数组,不能调整其尺寸 如add remove等方法
        list.add(6);
        list.remove(0);
    }

    @Test
    public void test3() {
        List<A> aList = new ArrayList<>(Arrays.asList(new A(),new A_1_1()));
        //java编程思想P221例子中指出尝试通过此方法来向声明为A的List中添加其子类型会报错，正确写法应为Arrays.<A>asList() 但在本例中通过测试
        List<A> aList1 = Arrays.asList(new A_1_1(),new A_2_1());
        System.out.println(aList);
        System.out.println(aList1);

    }
}

class A{}
class A_1 extends A{}
class A_2 extends A{}
class A_1_1 extends A_1{}
class A_2_1 extends A_2{}