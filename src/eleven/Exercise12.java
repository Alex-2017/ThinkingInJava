package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ListIterator<Integer> iterator1 = list1.listIterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        System.out.println("开始反向遍历==========");
        List<Integer> list2 = new ArrayList<>();
        while (iterator1.hasPrevious()) {
            list2.add(iterator1.previous());
        }
        System.out.println(list2);
    }
}
