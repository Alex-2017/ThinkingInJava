package eleven;

import java.util.PriorityQueue;

public class Exercise29 {
    //当一个类没有任何属性时，添加到PriorityQueue中并输出时会报错，因为没有可供比较的值，暂且了解即可
    public static void main(String[] args) {
        PriorityQueue<Normal> normals = new PriorityQueue<>();
        Normal normal_1 = new Normal();
        Normal normal_2 = new Normal();
        normals.offer(normal_1);
        normals.offer(normal_2);
        while (normals.peek() != null) {
            System.out.println(normals.poll());
        }
    }
}

class Normal {

}
