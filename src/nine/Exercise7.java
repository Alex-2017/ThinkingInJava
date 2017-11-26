package nine;

/**
 * Created by 10170 on 2017/10/9.
 */
public class Exercise7 {
    public static void main(String[] args){
        Mouse mouse = new Mouse();
        Gerbil gerbil = new Gerbil();
        Hamster hamster = new Hamster();
        mouse.run();
        gerbil.hide();
        hamster.run();
    }
}
interface Rodent{
    void run();

    void hide();
}

class Mouse implements Rodent{

    @Override
    public void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    public void hide() {
        System.out.println("Mouse.hide()");
    }
}

class Gerbil implements Rodent{

    @Override
    public void run() {
        System.out.println("Gerbil.run()");
    }

    @Override
    public void hide() {
        System.out.println("Gerbil.hide()");
    }
}

class Hamster implements Rodent {

    @Override
    public void run() {
        System.out.println("Hamster.run()");
    }

    @Override
    public void hide() {
        System.out.println("Hamster.hide()");
    }
}