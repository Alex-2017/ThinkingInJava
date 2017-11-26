package eleven;

import java.util.*;

public class Exercise5 {
    static Random random = new Random(47);

    //List中的比较依赖于其元素类型的equals()方法
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("1: " + ints);
        ints.add(8);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(8));
        ints.remove(Integer.valueOf(8));
        Integer i = ints.get(2);
        System.out.println("4: " + i + "  " + ints.indexOf(i));
        Integer j = 1;
        System.out.println("5: " + ints.indexOf(j));
        //注意此处remove方法有两种参数,一种是index,一种是Object 注意传入的参数
        System.out.println("6: " + ints.remove(j));
        System.out.println("7: " + ints.remove(i));
        System.out.println("8: " + ints);
        //add(index,element) 在索引为index的位置插入元素,之前位于该索引的元素往后移一位,addAll()同理
        ints.add(3, 0);
        System.out.println("9: " + ints);
        //subList(fromIndex,toIndex) 取索引大于等于fromIndex,小于toIndex之间的元素组成集合.
        List<Integer> sub = ints.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + ints.containsAll(sub));
        //当sub发生改变,所做的变化会影响到其初始列表,反之亦然.
        //sub改变前 [4,5,0] 初始列表ints [2,4,5,0,6,7]
        //sub经过排序后 [0,4,5] 初始列表ints [2,0,4,5,6,7]
        Collections.sort(sub);
        System.out.println("sorted sublist: " + sub);
        System.out.println("11: " + ints.containsAll(sub));
        //使sub集合中的元素混乱排序
        Collections.shuffle(sub, random);
        System.out.println("shuffled sublist: " + sub);
        //contailsAll 是否包含某集合,比较时不考虑其顺序.
        System.out.println("12: " + ints.containsAll(sub));
        List<Integer> copy = new ArrayList<>(ints);
        sub = Arrays.asList(ints.get(1), ints.get(4));
        System.out.println("sub: " + sub);
        //copy集合中保留copy与sub集合的交集
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(ints);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, 9);
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + ints.isEmpty());
        //清空集合中的元素
        ints.clear();
        System.out.println("19: " + ints);
        System.out.println("20: " + ints.isEmpty());
        ints.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println("21: " + ints);
        Object[] o = ints.toArray();
        System.out.println("22: " + o[3]);
        //集合转为数组，参数数组长度可写为0
        Integer[] ia = ints.toArray(new Integer[0]);
        System.out.println("23: " + ia[3]);
    }
}
