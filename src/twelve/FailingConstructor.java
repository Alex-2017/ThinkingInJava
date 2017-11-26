package twelve;

public class FailingConstructor {
    public final WithDispose w1, w2;

    public FailingConstructor(boolean fail) throws ConstructedException {
        w1 = new WithDispose(1);
        if (fail) {
            try {
                throw new ConstructedException();
            } catch (ConstructedException e) {
                w1.dispose();
                throw e;
            }
        }
        w2 = new WithDispose(2);
    }

    public void dispose() {
        w1.dispose();
        w2.dispose();
    }

    public static void main(String[] args) {
        try {
            for (boolean b = false; ; b = !b) {
                System.out.println("Construction ======");
                FailingConstructor failCons = new FailingConstructor(b);
                try {
                    System.out.println("processing");
                } finally {
                    System.out.println("clean up");
                    failCons.dispose();
                }
            }
        } catch (ConstructedException e) {
            System.out.println("FailingConstructor constructored failed");
            e.printStackTrace(System.out);
        }
    }
}

class ConstructedException extends Exception {
}

class WithDispose {
    public final int id;

    WithDispose(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WithDispose{" +
                "id=" + id +
                '}';
    }

    void dispose() {
        System.out.println("dispose" + this);
    }
}