package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Chapter11_6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=================");
        //iterator只可单向移动,在上面的循环中 iterator 已经到元素的最末端 所以重新声明iterator 来完成删除操作
        iterator = list.iterator();
        for (int i = 0; i < 3; i++) {
            //iterator.remove()移除元素移除iterator.next()对应的元素
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);

    }
}
