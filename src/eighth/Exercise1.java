package eighth;

/**
 * Created by 10170 on 2017/9/25.
 */
public class Exercise1 {

    public void cycleRide(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args){
        Cycle uniCycle = new UniCycle();
        Cycle triCycle = new TriCycle();
        Cycle biCycle = new BiCycle();
        uniCycle.ride();
        triCycle.ride();
        biCycle.ride();
    }
}
//exercise


class Cycle{
    private static int wheel = 1;

    public int getWheel() {
        wheel++;
        return wheel;
    }

    public void ride() {
        System.out.println("Cycle Ride()");
    }
}

class UniCycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("UniCycle Ride()"+" 拥有"+getWheel()+"个轮胎");
    }
}

class TriCycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("TriCycle Ride()"+" 拥有"+getWheel()+"个轮胎");
    }
}

class BiCycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("BiCycle Ride()"+" 拥有"+getWheel()+"个轮胎");
    }
}