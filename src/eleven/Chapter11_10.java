package eleven;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Chapter11_10 {
    @Test
    public void test1() {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int key = random.nextInt(20);
            Integer value = map.get(key);
            map.put(key, value == null ? 1 : value + 1);
        }
        System.out.println(map);
    }

    @Test
    public void test2() {
        Map<String, Object> map = new HashMap<>();
        map.put("Dog", new Dog("AAA"));
        map.put("Cat", new Cat("BBB"));
        map.put("Pug", new Pug("CCC"));
        System.out.println(map.containsKey("Dog"));
        //注意 当比较的是自定义的类时 需要重写该类的equals和hashcode方法
        System.out.println(map.containsValue(new Dog("AAA")));

    }

}

class Dog {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }
}

class Pug {
    private String name;

    Pug(String name) {
        this.name = name;
    }


}
