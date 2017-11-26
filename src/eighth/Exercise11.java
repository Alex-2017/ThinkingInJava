package eighth;

/**
 * Created by 10170 on 2017/9/30.
 */
public class Exercise11 extends Sandwich{
    private Field_1 field_1 = new Field_1();
    private Field_2 field_2 = new Field_2();
    private Field_3 field_3 = new Field_3();

    public Exercise11() {
        System.out.println("Exercise11 Constructor");
    }

    public static void main(String[] args){
        new Exercise11();
    }

}
class Meal{
    private Field_1 f = new Field_1("Inside Meal");

    public Meal() {
        System.out.println("Meal Constructor");
    }
}

class Lunch extends Meal{
    private Field_2 f = new Field_2("Inside Lunch");
    public Lunch() {
        System.out.println("Lunch Constructor");
    }
}


class Sandwich extends Lunch{
    private Field_3 f = new Field_3("Inside Sandwich");
    public Sandwich() {
        System.out.println("Sandwich Constructor");

    }
}

class Field_1{

    public Field_1(String s) {
        System.out.println(s+" Field_1 Constructor ");
    }

    public Field_1() {
        System.out.println("Field_1 Constructor");
    }
}
class Field_2{
    public Field_2(String s) {
        System.out.println(s+" Field_2 Constructor ");
    }

    public Field_2() {
        System.out.println("Field_2 Constructor");
    }
}
class Field_3{

    public Field_3(String s) {
        System.out.println(s+" Field_3 Constructor ");
    }

    public Field_3() {
        System.out.println("Field_3 Constructor");
    }
}
