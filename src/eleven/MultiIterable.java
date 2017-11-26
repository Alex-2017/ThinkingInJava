package eleven;

import java.util.*;

public class MultiIterable extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {

            @Override
            public Iterator<String> iterator() {
                //shuffle引用了由Arrays.asList产生的List对象而生成 所以shuffle的改变不会直接影响底层数组words的改变
                List<String> shuffle = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffle, new Random(47));
                return shuffle.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterable multiIterable = new MultiIterable();
        System.out.print("reversed---> ");
        for (String str : multiIterable.reversed()) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.print("randomized---> ");
        for (String str : multiIterable.randomized()) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.print("iterator---> ");
        //父类IterableClass不是Iterable<T>接口类型 所以不能使用foreach
        for (Iterator<String> it = multiIterable.iterator(); it.hasNext(); ) {
            String str = it.next();
            System.out.print(str + " ");
        }
    }
}
