package eleven;

import java.util.*;

public class Exercise11 {
    public static void printToString(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        List<Collection<String>> collectionList = new ArrayList<>(Arrays.asList(new ArrayList<String>(), new LinkedList<String>(), new HashSet<String>(), new TreeSet<String>()));
        for (Collection<String> coll : collectionList) {
            E04_MovieNameGenerator.fillCollect(coll);
        }
        for (Collection<String> collection : collectionList) {
            printToString(collection.iterator());
            System.out.println("------");
        }

    }
}
