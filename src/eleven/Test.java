package eleven;

import java.util.*;

public class Test {

    //integerList.subList()所产生的列表与integerList两者之间相互关联,无论对哪个列表做出修改,都会直接影响这两个列表.
    @org.junit.Test
    public void test1() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> subList = integerList.subList(2, 7);
        System.out.println("initial list :" + integerList);
        System.out.println("initial subList :" + subList);
        Random random = new Random();
        Collections.shuffle(integerList, random);
        System.out.println("after shuffle list :" + integerList);
        System.out.println("after shuffle subList :" + subList);
        Collections.sort(subList);
        System.out.println("after sorted list :" + integerList);
        System.out.println("after sorted subList :" + subList);
    }

    @org.junit.Test
    public void test2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("initial list: " + list);
        //containsAll不比较集合的顺序
        List<Integer> subList = new ArrayList<>(Arrays.asList(3, 4, 1));
        System.out.println(list.containsAll(subList));
    }


    @org.junit.Test
    public void test3() {
        //情景一
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 2, 1));
        //removeAll()不比较集合的顺序
        System.out.println(list.removeAll(list2));
        System.out.println(list);
        System.out.println(list2);
        //情景二
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> subList = list.subList(1, 5);
        System.out.println("subList: "+subList);

        //当使用removeAll()方法移除从其本身调用subList()生成的的subList后 subList集合消失了
        //list.removeAll(subList);
        //若调用subList对象 会抛出运行时异常ConcurrentModificationException
        //System.out.println(subList);

        //若需要在removeAll()后仍调用subList 可使用以下方法方法
        //方法二 创建subList对象的复制,随后list调用removeAll()移除subList,操作subListCopy的对象
        //此种方法不管是removeAll的是subList还是subListCopy subList在移除后都会消失 所以仍不能调用subList
        List<Integer> subListCopy = new ArrayList<>(subList);
        System.out.println("subListCopy: "+subListCopy);
        list.removeAll(subList);
        System.out.println("subListCopy: "+subListCopy);

        System.out.println("after remove list: "+ list);
    }

    //a.removeAll(b) a集合移除b集合所有的元素(不论a是否完全包含b)
    @org.junit.Test
    public void test4() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        System.out.println(list1);
        System.out.println(list1.containsAll(list2));
        System.out.println(list1.removeAll(list2));
        System.out.println(list1);
    }

    @org.junit.Test
    public void test5() {
        String[] arr1 = {"KK","AA","WW","QQ","ZZ","BB","TT","YY"};
        System.out.println(Arrays.toString(arr1));
        //Arrays.sort(Object[] obj) 对数组进行升序排列
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    @org.junit.Test
    public void test6() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+"->"+iterator.nextIndex());
        }
    }


    @org.junit.Test
    public void test7() {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        //集合转数组
        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }

}
