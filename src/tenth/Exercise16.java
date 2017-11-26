package tenth;

public class Exercise16 {
    public void customFactory(CycleFactory factory) {
        factory.getCycle().run();
    }

    public static void main(String[] args) {
        Exercise16 exercise16 = new Exercise16();
        exercise16.customFactory(UniCycle.cycleFactory);
        exercise16.customFactory(BiCycle.cycleFactory);
        exercise16.customFactory(TriCycle.cycleFactory);
    }
}
interface Cycle{
    void run();
}

interface CycleFactory{
    Cycle getCycle();
}

class UniCycle implements  Cycle{

    private UniCycle() {

    }

    @Override
    public void run() {
        System.out.println("UniCycle.run()");
    }

    public static CycleFactory cycleFactory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new UniCycle();
        }
    };
}

class BiCycle implements  Cycle{

    private BiCycle() {

    }

    @Override
    public void run() {
        System.out.println("BiCycle.run()");
    }

    public static CycleFactory cycleFactory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new BiCycle();
        }
    };
}

class TriCycle implements  Cycle{

    private TriCycle() {

    }

    @Override
    public void run() {
        System.out.println("TriCycle.run()");
    }

    public static CycleFactory cycleFactory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new TriCycle();
        }
    };
}