package eleven;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise14 {
    //将元素插入到list的中间
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 1; i <= 10; i++) {
            iterator.add(i);
            if (i % 2 == 0) {
                iterator.previous();
            }
        }
        System.out.println(list);
    }
}
