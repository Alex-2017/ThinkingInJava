package eleven;

import java.util.Collection;
import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        for(int i=0;i<10;i++) {
            collection.add(i);
        }
        for (Integer integer : collection) {
            System.out.println(integer);
        }
    }
}
