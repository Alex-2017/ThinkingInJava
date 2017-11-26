package eleven;

import java.util.Iterator;

public class IterableClass{

    protected String[] words = "Today is so cold, everyone do not want go out".split(" ");

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        IterableClass iterableClass = new IterableClass();
        for (Iterator<String> it = iterableClass.iterator(); it.hasNext(); ) {
            String str = it.next();
            System.out.print(str+" ");
        }
    }
}
