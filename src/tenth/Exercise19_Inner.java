package tenth;

public class Exercise19_Inner {
    class Inner{
        class Inner_1{
            void inner() {
                System.out.println("Exercise19_Inner.Inner.Inner_1.inner()");
            }

        }
        Inner_1 getInner_1() {
            return new Inner_1();
        }

        public void inner() {
            System.out.println("Exercise19_Inner.Inner.inner()");
        }

    }
    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Exercise19_Inner exercise19Inner = new Exercise19_Inner();
        Exercise19_Inner.Inner inner = exercise19Inner.getInner();
        inner.inner();
        Exercise19_Inner.Inner.Inner_1 inner_1 = inner.getInner_1();
        inner_1.inner();
    }
}
