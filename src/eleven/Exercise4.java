package eleven;


import org.junit.Test;

import java.util.*;

public class Exercise4 {
    @Test
    public void test1() {
        System.out.println("String[4] is " + Arrays.toString(E04_MovieNameGenerator.fill(new String[4])));
        //
        System.out.println("ArrayList 按照插入的顺序保存元素，索引速度较快-" + E04_MovieNameGenerator.fillCollect(new ArrayList<>()));
        System.out.println("LinkedList 对集合中插入元素和删除元素较快 -"+E04_MovieNameGenerator.fillCollect(new LinkedList<>()));
        System.out.println("HashSet 不能重复 按照其本身算法进行排序-"+E04_MovieNameGenerator.fillCollect(new HashSet<>()));
        System.out.println("LinkedHashSet 不能重复 按照插入的顺序保存元素-"+E04_MovieNameGenerator.fillCollect(new LinkedHashSet<>()));
        System.out.println("TreeSet 不能重复 按照元素的升序进行排列-"+E04_MovieNameGenerator.fillCollect(new TreeSet<>()));
    }
}

interface Generator<T> {
    T next();
}

class MovieNameGenerator implements Generator<String> {

    String[] characters = {"Thor", "Hook", "IronMan", "SuperMan", "SexGirl", "One Person's worship", "AAA", "BBB"};

    int next;

    @Override
    public String next() {
        String str = characters[next];
        next = (next + 1) % characters.length;
        return str;
    }
}

class E04_MovieNameGenerator {
    private static final MovieNameGenerator mov = new MovieNameGenerator();

    static String[] fill(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mov.next();
        }
        return arr;
    }

    static Collection<String> fillCollect(Collection<String> collection) {
        for (int i = 0; i < 4; i++) {
            collection.add(mov.next());
        }
        return collection;
    }
}