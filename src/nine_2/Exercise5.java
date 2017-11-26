package nine_2;

import nine.Animal;
import org.junit.Test;

/**
 * Created by 10170 on 2017/10/9.
 */
public class Exercise5 implements Animal{
    @Override
    public void walk() {
        System.out.println("Exercise5.walk()");
    }

    @Override
    public void eat() {
        System.out.println("Exercise5.eat()");
    }

    @Override
    public void drink() {
        System.out.println("Exercise5.drink()");
    }

    @Test
    public void exercise5() {
        Exercise5 exercise5 = new Exercise5();
        exercise5.walk();
        exercise5.eat();
        exercise5.drink();
    }
}
