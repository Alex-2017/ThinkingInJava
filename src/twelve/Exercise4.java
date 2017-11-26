package twelve;

public class Exercise4 {

    public static void method() throws AException {
        System.out.println("there is method()");
        throw new AException("自定义异常信息");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (AException e) {
            System.out.println(e.getMessage());
        }
    }


}

class AException extends Exception {
    public AException() {

    }

    public AException(String msg) {
        super(msg);
    }
}