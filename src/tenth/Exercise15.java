package tenth;

public class Exercise15 {
    public Exercise15(String str) {
        System.out.println("Outer Constructor");
    }

    public Exercise15 getExercise15(String str) {
        return new Exercise15(str) {
            {
                System.out.println("Inner Exercise15,str is " + str);
            }
        };
    }

    public String getExercise15_1(String str) {
        return new Exercise15(str) {
            public String getStr() {
                return str;
            }
        }.getStr();
    }

    public static void main(String[] args) {
        Exercise15 exercise15_1 = new Exercise15("Outer");
        Exercise15 exercise15_2 = exercise15_1.getExercise15("Inner");
        System.out.println(exercise15_2.getExercise15_1("123"));
        System.out.println(exercise15_1 == exercise15_2);
    }
}
