package tenth;

public interface Exercise21 {
    void f();

    void g();

    class Nest {
        static void service(Exercise21 imp) {
            System.out.println("Call imp.f()");
            imp.f();
            System.out.println("Call imp.g()");
            imp.g();
        }
    }

    static void main(String[] args) {
        Exercise21 imp = new Exercise21() {
            @Override
            public void f() {
                System.out.println("this f method");
            }

            @Override
            public void g() {
                System.out.println("this g method");
            }
        };

        Nest.service(imp);
    }
}
