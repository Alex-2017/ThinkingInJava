package tenth;

/**
 * Created by 10170 on 2017/10/20.
 */
public class Exercise1 {
    private String str = "123456";

    class Inner {
        int value = 10;
        {
            System.out.println("Inner Created");
        }

        String printStr() {
            return str;
        }
    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args){
        Exercise1 exercise1 = new Exercise1();
        Exercise1.Inner inner = exercise1.getInner();
        System.out.println(inner.value);
        System.out.println(inner.printStr());
    }

}
