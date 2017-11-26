package nine;

/**
 * Created by 10170 on 2017/10/9.
 */
public class Exercise9 {

    public static void tune(Playable playable) {
        playable.play();
    }

    public static void main(String[] args){
        Playable wind = new Wind();
        tune(wind);
        Playable percussion = new Percussion();
        tune(percussion);
        Playable woodWind = new WoodWind();
        tune(woodWind);
    }
}
class Instrument{
    public void adjust(String str) {
        System.out.println(this+".adjust("+str+")");
    }
}

class Wind extends Instrument implements Playable {
    public String toString() {
        return "Wind";
    }

    @Override
    public void play() {
        System.out.println(this+".play()");
    }
}

class Percussion extends Instrument implements Playable{
    public String toString() {
        return "Percussion";
    }

    @Override
    public void play() {
        System.out.println(this+".play()");
    }
}

interface Playable{
    void play();
}

class WoodWind extends Wind{
    public String toString() {
        return "WoodWind";
    }
}