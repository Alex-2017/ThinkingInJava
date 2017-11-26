package nine;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class Exercise_1_2 {
    @Test
    public void exercise1() {
        Baby baby = new Baby();
        baby.drink();
        baby.eat();
        baby.walk();
    }

    @Test
    public void exercise2() {
        People people = new People() {
            @Override
            public void eat() {
                System.out.println("people eat");
            }

            @Override
            public void drink() {
                System.out.println("people drink");
            }

            @Override
            public void walk() {
                System.out.println("people walk");
            }
        };
        people.eat();
        people.drink();
        people.walk();
    }

}
abstract class People{
    public abstract void eat();
    public abstract void drink();
    public abstract void walk();
}

class Baby extends People{

    @Override
    public void eat() {
        System.out.println("Baby eat");
    }

    @Override
    public void drink() {
        System.out.println("Baby drink");
    }

    @Override
    public void walk() {
        System.out.println("Baby walk");
    }
}