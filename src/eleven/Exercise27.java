package eleven;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise27 {
    public static void main(String[] args) {
        Commond commond1 = new Commond("AA");
        Commond commond2 = new Commond("BB");
        Commond commond3 = new Commond("CC");
        CommandQueue.offer(commond1);
        CommandQueue.offer(commond2);
        CommandQueue.offer(commond3);
        Queue<Commond> commonds = CommandQueue.getQueue();
        Consumer consumer = new Consumer();
        consumer.consume(commonds);
        consumer.consume(commonds);
        consumer.consume(commonds);
    }
}

class Commond {
    private String content;

    public Commond(String content) {
        this.content = content;
    }

    public void operation() {
        System.out.println(content);
    }
}

class CommandQueue {
    private static Queue<Commond> commonds = new LinkedList<>();

    public static Commond offer(Commond commond) {
        //
        commonds.offer(commond);
        return commonds.peek();
    }

    public static Queue<Commond> getQueue() {
        return commonds;
    }
}

class Consumer {
    public void consume(Queue<Commond> commonds) {
        Commond commond = commonds.poll();
        commond.operation();
    }
}