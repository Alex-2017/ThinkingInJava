package fifth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */

public class ConstructorInitial {
    @Test
    public void initalSequence() {
        new House();
    }
}
class Window{
    public Window(int mark) {
        System.out.println("Window("+mark+")");
    }
}

class House{
    Window window1 = new Window(1);

    public House() {
        System.out.println("House Constructor");
        new Window(4);
    }
    static Window window_s1 = new Window(111);

    Window window2 = new Window(2);

    Window window3 = new Window(3);

    static Window window_s2 = new Window(222);
}
