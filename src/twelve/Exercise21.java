package twelve;

public class Exercise21 extends BaseExercise21 {

    //直接抛出父类构造器抛出的异常信息
    Exercise21() throws OneException {
    }

    //不能在子类构造器中捕获OneException 因为没有类的实例对象
    //Exercise21() {
    //    try {
    //        super();
    //    } catch (OneException e) {
    //        e.printStackTrace();
    //    }
    //}

    public static void main(String[] args) {
        try {
            Exercise21 exercise21 = new Exercise21();
        } catch (OneException e) {
            e.printStackTrace();
        }
    }

}

class OneException extends Exception {
    OneException(String string) {
        super(string);
    }
}

class BaseExercise21 {
    BaseExercise21() throws OneException {
        throw new OneException("Hi There!");
    }
}