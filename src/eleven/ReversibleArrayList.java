package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> collection) {
        super(collection);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        ReversibleArrayList<String> reversibleArrayList = new ReversibleArrayList<>(Arrays.asList("To Be Or Not To Be".split(" ")));
        for (String str : reversibleArrayList) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("use reversed iterable");
        for (String str : reversibleArrayList.reversed()) {
            System.out.print(str + " ");
        }
    }
}
