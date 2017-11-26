package eleven;

import java.util.PriorityQueue;
import java.util.Random;

public class Exercise28 {
    public static void main(String[] args) {
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        Random random = new Random(47);
        for(int i=0;i<10;i++) {
            doubles.offer(random.nextDouble());
        }
        while (doubles.peek() != null) {
            System.out.println(doubles.poll());
        }
    }
}
