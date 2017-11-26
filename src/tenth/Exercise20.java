package tenth;

public interface Exercise20 {
    void f();

    String weather = "sunny";

    class Nest implements Exercise20 {
        @Override
        public void f() {
            System.out.println("Exercise20.f()");
        }

        public static void nest() {
            System.out.println("Exercise20.Nest.nest()"+weather);
        }

        public static void main(String[] args) {
            Nest nest = new Nest();
            nest.f();
            Nest.nest();
        }
    }

}
