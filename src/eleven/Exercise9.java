package eleven;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Exercise9 {
    public static void main(String[] args) {
        Selector1 selector1 = new Selector1(10);
        for(int i=0;i<10;i++) {
            selector1.add(Integer.toString(i));
        }
        for(Iterator<Object> iterator = selector1.iterator();iterator.hasNext();) {
            System.out.print(iterator.next()+" ");
        }
    }
}

class Selector1 {
    private Object[] objects;
    private int next;

    public Selector1(int size) {
        objects = new Object[size];
    }

    public void add(Object object) {
        if (next < objects.length) {
            objects[next++] = object;
        }
    }

    private class Selector1Iterator implements Iterator<Object> {
        private int i;
        @Override
        public boolean hasNext() {
            return i < objects.length;
        }
        @Override
        public Object next() {
            if (hasNext())
                return objects[i++];
            throw new NoSuchElementException();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Object> iterator() {
        return new Selector1Iterator();
    }
}
