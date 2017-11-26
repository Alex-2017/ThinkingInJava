package fifth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class StaticInitialization {
    @Test
    public void initial_1() {
        new Cups();
    }

    @Test
    public void initial_2() {
        Cups.cup2.drink(100);
        Cups.drinkTea();
    }
}

class Cup{
    public Cup(int mark){
        System.out.println("Cup("+mark+")");
    }

    public void drink(int mark) {
        System.out.println("drink("+mark+")");
    }
}

class Cups{
    public static Cup cup1 = new Cup(1);
    public static Cup cup2 = new Cup(2);
    Cup cup3 = new Cup(3);

    public static void drinkTea() {
        System.out.println("Inside Cups drinkTea()");
    }

}

