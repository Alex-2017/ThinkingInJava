package eleven;

import org.junit.Test;

import java.util.*;

public class Chapter11_9 {

    //HashSet和TreeSet的区别 HashSet按其特定算法排序，TreeSet按照升序进行排序
    //Set类型为Integer时,HashSet和TreeSet输出的结果都一样
    @Test
    public void test1() {
        Random random = new Random(47);
        Set<Double> hashSet = new HashSet<>();
        Set<Double> treeSet = new TreeSet<>();
        for(int i=0;i<10;i++) {
            hashSet.add(random.nextDouble()*10);
            treeSet.add(random.nextDouble()*10);
        }
        System.out.println("hashSet->"+hashSet);
        System.out.println();
        System.out.println("treeSet->"+treeSet);
    }



    @Test
    public void test2() {
        Set<Integer> hashSet1 = new HashSet<>(Arrays.asList(1,4,5,6,2,3,4,5,14,15));
        Set<Integer> hashSet2 = new HashSet<>(Arrays.asList(111, 333, 1, 4, 5));
        System.out.println(hashSet1.containsAll(hashSet2));
        System.out.println(hashSet1);
        //hashSet1 没有完全包含hashSet2  而removeAll()将hashSet1中所包含的hashSet2所有元素全部移除
        System.out.println(hashSet1.removeAll(hashSet2));
        System.out.println(hashSet1);
    }

}
