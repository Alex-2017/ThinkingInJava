package eighth;

/**
 * Created by 10170 on 2017/9/30.
 */
public class Exercise17 {
    public static void main(String[] args){
        Day[] days = {new Morning(), new Noon(), new Evening()};
        Morning morning = (Morning) days[0];
        Noon noon = (Noon) days[1];
        Evening evening = (Evening) days[2];
        morning.hello();
        noon.hello();
        //evening.
    }
}

class Day {

}

class Morning extends Day{
    public void hello() {
        System.out.println("Morning Hello()");
    }
}

class Noon extends Day{
    public void hello() {
        System.out.println("Noon Hello()");
    }
}

class Evening extends Day{

}
