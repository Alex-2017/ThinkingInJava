package tenth;

import tenth.exercise12.Destination;

public class Exercise12 {
    private String mood = "smooth";

    private void getMood() {
        System.out.println("the mood is " + mood);
    }

    public Destination destination() {
        return new Destination() {
            @Override
            public String readLabel() {
                mood = "anonymous";
                return mood;
            }
        };
    }

    private int i = 10;

    public void f() {
        new Object() {
            void o() {
                i++;
            }
        }.o();
    }

    public static void main(String[] args) {
        //my code
        Exercise12 exercise12 = new Exercise12();
        exercise12.getMood();
        Destination destination = exercise12.destination();
        System.out.println(destination.readLabel());
        //standard answer
        System.out.println(exercise12.i);
        exercise12.f();
        System.out.println(exercise12.i);
    }
}
