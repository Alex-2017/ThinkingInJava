package tenth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/22.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i=0;i<10;i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();
        //Selector selector = sequence.new SequenceSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }

    @Test
    public void exercise4() {
        Sequence sequence = new Sequence(10);
        Sequence.SequenceSelector sequenceSelector = sequence.getSequenceSelector();
        sequenceSelector.getSequence().sequ();
        System.out.println(sequence.check());
    }

}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int index = 0;

    public void add(Object x) {
        if (index < items.length) {
            items[index++] = x;
        }
    }

    public Sequence(int length) {
        items = new Object[length];
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    public SequenceSelector getSequenceSelector() {
        return new SequenceSelector();
    }

    //内部类可以直接访问（忽略权限修饰符）外部类的方法和字段
    class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }

        //exercise4 在内部类中 通过外部类.this生成对外部类的引用
        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public void sequ() {
        System.out.println("Sequence.sequ()");
    }

    public boolean check() {
        return this == getSequenceSelector().getSequence();
    }

}
