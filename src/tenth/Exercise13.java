package tenth;

import tenth.exercise12.Contents;

public class Exercise13 {
    public Contents getContents() {
        return new Contents() {
            @Override
            public int value() {
                return 123;
            }
        };
    }

    public static void main(String[] args) {
        Exercise13 exercise13 = new Exercise13();
        Contents contents = exercise13.getContents();
        System.out.println(contents.value());
    }
}
