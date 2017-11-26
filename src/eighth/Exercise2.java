package eighth;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 10170 on 2017/9/25.
 */
public class Exercise2 {
    public Shape generateRandomShape() {
        java.util.Random random = new java.util.Random();
        Shape shape = null;
        switch (random.nextInt(4)) {
            case 0:
                shape = new Circle();
                break;
            case 1:
                shape = new Triangle();
                break;
            case 2:
                shape = new Square();
                break;
            case 3:
                shape = new Oval();
        }
        return shape;
    }

    @Test
    public void exercise2() {
        Shape[] shapes = new Shape[10];
        //使用foreach语句对数组赋值无效，因为改变的只有对象的内容，但并没有将对象的引用指向数组中去
        //for (Shape shape : shapes) {
        //    shape = generateRandomShape();
        //}
        for(int i=0;i<shapes.length;i++) {
            shapes[i] = generateRandomShape();
        }
        System.out.println(shapes.length);
        Arrays.stream(shapes).forEach(shape -> {
           shape.draw();
           shape.solid();
        });
    }
}

class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void solid() {
        System.out.println("  Shape solid()");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.print("Square draw()");
    }

    @Override
    public void erase() {
        System.out.print("Square erase()");
    }

    @Override
    public void solid() {
        System.out.println(" Square solid()");
    }

}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.print("Triangle draw()");
    }

    @Override
    public void erase() {
        System.out.print("Triangle erase()");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.print("Circle draw()");
    }

    @Override
    public void erase() {
        System.out.print("Circle erase()");
    }
}

class Oval extends Shape {
    @Override
    public void draw() {
        System.out.print("Oval draw()");
    }

    @Override
    public void erase() {
        System.out.print("Oval erase()");
    }
}