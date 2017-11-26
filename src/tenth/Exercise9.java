package tenth;

import tenth.exercise6_1.SimpleInterface;

public class Exercise9 {
    public SimpleInterface getInnerSimple() {
        class InnerSimple implements SimpleInterface {
            @Override
            public void f() {
                System.out.println("方法内部类->HI I'm Exercise9.InnerSimple");
            }
        }
        return new InnerSimple();
    }

    public static void main(String[] args) {
        Exercise9 exercise9 = new Exercise9();
        SimpleInterface simpleInterface = exercise9.getInnerSimple();
        simpleInterface.f();
    }
}
