package tenth;

public class Exercise22 {
    private Object[] objects;
    private int index;

    public Exercise22(int length) {
        objects = new Object[length];
    }

    public void add(Object object) {
        if (index < objects.length) {
            objects[index] = object;
            index++;
        }
    }

    class ReverseSelector implements Selector {
        private int mark = objects.length - 1;

        @Override
        public boolean end() {
            return mark < 0;
        }

        @Override
        public Object current() {
            return objects[mark];
        }

        @Override
        public void next() {
            if (mark >= 0)
                mark--;
        }
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    class SequenceSelector implements Selector {
        private int mark;

        @Override
        public boolean end() {
            return mark == objects.length;
        }

        @Override
        public Object current() {
            return objects[mark];
        }

        @Override
        public void next() {
            if (mark < objects.length) {
                mark++;
            }
        }
    }

    Selector getSequenceSelctor() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Exercise22 exercise22 = new Exercise22(10);
        for (int i = 1; i < 11; i++) {
            exercise22.add(i);
        }
        Selector reverseSelector = exercise22.reverseSelector();

        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current()+",");
            reverseSelector.next();
        }
        System.out.println();
        Selector sequenceSelector = exercise22.getSequenceSelctor();
        while (!sequenceSelector.end()) {
            System.out.print(sequenceSelector.current()+",");
            sequenceSelector.next();
        }
    }
}
