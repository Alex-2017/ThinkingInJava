package tenth;

import tenth.exercise6_1.SimpleInterface;

public class Exercise11 {
    private class Inner implements SimpleInterface{

        @Override
        public void f() {
            System.out.println("I'm Exercise11.Inner");
        }
    }

    public SimpleInterface getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Exercise11 exercise11 = new Exercise11();
        Exercise11.Inner inner = (Inner) exercise11.getInner();
        inner.f();
    }
}
