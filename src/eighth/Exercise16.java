package eighth;

/**
 * Created by 10170 on 2017/9/30.
 */
public class Exercise16 {
    public static void main(String[] args){
        Starship starship = new Starship();
        starship.sendStatus();
        starship.changeTo_B();
        starship.sendStatus();
        starship.changeTo_C();
        starship.sendStatus();
        starship.changeTo_A();
        starship.sendStatus();
    }
}
class Status{
    public void sendStatus() {
        System.out.println("Base Status()");
    }
}

class Status_A extends Status{
    @Override
    public void sendStatus() {
        System.out.println("Status_A Status()");
    }
}

class Status_B extends Status{
    @Override
    public void sendStatus() {
        System.out.println("Status_B Status()");
    }
}

class Status_C extends Status{
    @Override
    public void sendStatus() {
        System.out.println("Status_C Status()");
    }
}

class Starship{
    private Status status = new Status_A();

    public void sendStatus() {
        status.sendStatus();
    }

    public void changeTo_A() {
        status = new Status_A();
    }

    public void changeTo_B() {
        status = new Status_B();
    }

    public void changeTo_C() {
        status = new Status_C();
    }
}