package eleven;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i =0;i<10;i++) {
            sequence.add(i);
        }
        Selector selector = sequence.getSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }

    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private final List<Object> list = new ArrayList<>();

    public void add(Object object) {
        list.add(object);
    }

    class SequenceSelector implements Selector {
        private int i;

        @Override
        public boolean end() {
            return i == list.size();
        }

        @Override
        public Object current() {
            return list.get(i);
        }

        @Override
        public void next() {
            if (i < list.size()) {
                i++;
            }
        }
    }

    Selector getSelector() {
        return new SequenceSelector();
    }
}