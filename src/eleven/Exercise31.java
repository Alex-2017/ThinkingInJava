package eleven;

import java.util.Iterator;
import java.util.Random;

public class Exercise31 implements Iterable<Shape> {

    private Random random = new Random(47);
    private int quantity;

    public Exercise31(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < quantity;
            }

            @Override
            public Shape next() {
                index++;
                return randomShape();
            }
        };
    }

    private Shape randomShape() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            case 2:
                return new Square();
        }
    }

    public static void main(String[] args) {
        Exercise31 exercise31 = new Exercise31(10);
        //方法一 使用iterator调用
        Iterator<Shape> iterator =  exercise31.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //方法二 此类实现了Iterator<Shape> 可直接进行foreach遍历对象
        for (Shape shape : exercise31) {
            System.out.println(shape);
        }
    }
}

class Shape {
    public String toString() {
        return "Shape";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}
