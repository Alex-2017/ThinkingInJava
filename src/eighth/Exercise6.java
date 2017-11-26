package eighth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/9/27.
 */
public class Exercise6 {

    public void tune(Instrument instrument) {
        instrument.play(Note.Primary);
        System.out.println(instrument);
    }

    public void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    private java.util.Random random = new java.util.Random();

    public Instrument instrumentGenerator() {
        Instrument instrument = new Instrument();
        switch (random.nextInt(6)) {
            case 0:
                instrument = new Instrument();
                break;
            case 1:
                instrument = new Wind();
                break;
            case 2:
                instrument = new Percussion();
                break;
            case 3:
                instrument = new Stringed();
                break;
            case 4:
                instrument = new WoodWind();
                break;
            case 5:
                instrument = new Brass();
                break;
        }
        return instrument;
    }

    public Instrument instrumentGenerator2() throws IllegalAccessException, InstantiationException {
        Class<?>[] instruments = {
                Instrument.class,Wind.class,Percussion.class,Stringed.class,WoodWind.class,Brass.class
        };
        return (Instrument) instruments[random.nextInt(instruments.length)].newInstance();
    }

    @Test
    public void exercise6() {
        Instrument[] instruments = {
                new Wind(), new Percussion(), new Stringed(), new WoodWind(), new Brass()
        };
        tuneAll(instruments);
    }

    @Test
    public void exercise8() {
        Instrument[] instruments = new Instrument[15];
        for(int i=0;i<instruments.length;i++) {
            instruments[i] = instrumentGenerator();
        }
        tuneAll(instruments);
    }

    @Test
    public void exercise8_1() throws InstantiationException, IllegalAccessException {
     for(int i=0;i<10;i++) {
         tune(instrumentGenerator2());
     }
    }

    @Test
    public void testMathAbs() {
        Math.abs(1);
    }
}

enum Note {
    Primary, Senior, Junior
}

class Instrument {
    void play(Note t) {
        System.out.println("Instrument play "+t);
    }

    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument{
    @Override
    void play(Note t) {
        System.out.println("Wind play "+t);
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument{
    @Override
    void play(Note t) {
        System.out.println("Percussion play "+t);
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note t) {
        System.out.println("Stringed play "+t);
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class WoodWind extends Wind {
    @Override
    void play(Note t) {
        System.out.println("WoodWind play "+t);
    }
}

class Brass extends Wind {
    @Override
    void play(Note t) {
        System.out.println("Brass play "+t);
    }
}
