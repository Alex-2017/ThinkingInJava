package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List<One> list = new ArrayList<>(Arrays.asList(new One(), new One(), new One(), new One(), new One()));
        List<One> subList = list.subList(1, 4);
        System.out.println("list: " + list);
        System.out.println("subList " + subList);
        //list.removeAll(subList);
        //
        subList.clear();
        System.out.println(subList);
        System.out.println("after removed list: "+list);
    }
}

class One {
    private static int i = 1;

    private int id = i++;

    @Override
    public String toString() {
        return "One{" +
                "id=" + id +
                '}';
    }
}