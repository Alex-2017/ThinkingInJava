package tenth;

public class Chapter10_10 {
    public static void main(String[] args) {
        Egg egg = new EggChild();
        System.out.println("-------------------------------------------------------");
        Father father = new Son();
    }

}
class Egg{
    class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("Egg's Constructor");
        new Yolk();
    }

}

class EggChild extends Egg {
    public EggChild() {
        System.out.println("EggChild's Constructor");
    }

    class Yolk {
        public Yolk() {
            System.out.println("EggChild.Yolk()");
        }
    }
}

class Father {
    public void f() {
        System.out.println("father");
    }

    public Father() {
        System.out.println("Father's Constructor");
        f();
    }
}

class Son extends Father {
    @Override
    public void f() {
        System.out.println("son");
    }

    public Son() {
        System.out.println("Son's Constructor");
    }
}