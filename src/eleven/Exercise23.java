package eleven;

import java.util.*;

public class Exercise23 {
    private static Random random = new Random(47);

    public static void main(String[] args) {
        Map<Integer, Counter> m = new HashMap<>();
        for(int i=0;i<10000;i++) {
            int r = random.nextInt(100);
            if (m.containsKey(r)) {
                m.get(r).i++;
            } else {
                m.put(r, new Counter());
            }
        }
        List<HistoUnit> list = new ArrayList<>();
        m.forEach((k,v)->{
            HistoUnit histoUnit = new HistoUnit(v,k);
            list.add(histoUnit);
        });
        //按照counter中的i进行排序
        Collections.sort(list);
        list.forEach(a-> System.out.println("val "+a.val+" has "+a.counter));
    }
}

class Counter {
    int i = 1;

    public String toString() {
        return Integer.toString(i);
    }
}

class HistoUnit implements Comparable<HistoUnit> {

    Counter counter;
    Integer val;

    public HistoUnit(Counter counter, Integer val) {
        this.counter = counter;
        this.val = val;
    }

    @Override
    public int compareTo(HistoUnit o) {
        int lv = o.counter.i;
        int rv = this.counter.i;
        return Integer.compare(lv, rv);
    }

    @Override
    public String toString() {
        return "HistoUnit{" +
                "counter=" + counter +
                ", val=" + val +
                '}';
    }
}
