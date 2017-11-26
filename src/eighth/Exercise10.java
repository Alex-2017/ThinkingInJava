package eighth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/9/27.
 */
public class Exercise10 {
    @Test
    public void exercise10() {
        Rice rice = new Rice();
        Food food = new Rice();
        rice.eat();
        food.eat();
    }

}

class Food {
    void eat() {
        System.out.println("eat "+buy());
    }

    String buy() {
        return "Food";
    }
}

class Rice extends Food {
    @Override
    String buy() {
        return "Rice";
    }
}


