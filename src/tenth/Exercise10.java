package tenth;

import tenth.exercise6_1.SimpleInterface;

public class Exercise10 {
    public SimpleInterface getInnerSimiple(boolean flag) {
        if (flag) {
            class InnerSimple implements SimpleInterface {

                @Override
                public void f() {
                    System.out.println("HI,I'm Exercise10.InnerSimple");
                }
            }
            return new InnerSimple();
        }else {
            return new SimpleInterface() {
                @Override
                public void f() {
                    System.out.println("I'm SimpleInterface");
                }
            };
        }
    }

    public static void main(String[] args) {
        new Exercise10().getInnerSimiple(true).f();
        new Exercise10().getInnerSimiple(false).f();
    }
}
