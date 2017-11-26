package tenth;

/**
 * Created by 10170 on 2017/10/23.
 */
public class Exercise5 {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}

class Outer {
    class Inner {
        {
            System.out.println("Inner class created!");
        }
    }
}