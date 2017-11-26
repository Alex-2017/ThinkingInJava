package tenth.ControlFramework;

public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        public String toString() {
            return "light is close";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "GreenHouse water is on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "GreenHouse water is off";
        }
    }

    private boolean fanOpen = false;
    public class FanOpen extends Event{

        public FanOpen(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            fanOpen = true;
        }

        public String toString() {
            return "Fan is open";
        }
    }

    public class FanClose extends Event{

        public FanClose(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            fanOpen = false;
        }

        public String toString() {
            return "Fan is close";
        }
    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Bing";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action() {
            for (Event event : eventList) {
                event.start();
                addEvent(event);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restarting System";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Terminate System";
        }
    }

    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new LightOn(100),
                gc.new LightOff(200),
                gc.new WaterOn(300),
                gc.new WaterOff(400),
                gc.new FanOpen(500),
                gc.new FanOpen(600)
        };

        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(
                    new Integer(args[0])
            ));
        }
        gc.run();
    }
}
