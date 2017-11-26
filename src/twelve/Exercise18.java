package twelve;

import org.junit.Test;

public class Exercise18 {

    public static void important() throws VerImportException {
        throw new VerImportException();
    }

    public static void trival() throws TrivalException {
        throw new TrivalException();
    }

    public static void another() throws AnotherException {
        throw new AnotherException();
    }

    //异常的丢失问题  当有多个try-finally时 执行最外一层的try-finally中的内容
    public static void main(String[] args) {
        try {
            try {
                try {
                    important();
                } finally {
                    another();
                }
            } finally {
                trival();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //try-finally finally中直接返回return 导致抛出异常的丢失
    @Test
    public void test1() {
        try {
            throw new NullPointerException();
        } finally {
            return;
        }
    }

    //在外层添加一层try-catch 來捕获可能丢失的异常
    @Test
    public void exercise19() {
        try {
            try {
                important();
            } finally {
                try {
                    trival();
                } catch (TrivalException e) {
                    System.out.println(e);
                }
                try {
                    another();
                } catch (AnotherException e) {
                    System.out.println(e);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }


}

class VerImportException extends Exception {
    public String toString() {
        return "VerImportException";
    }

}

class TrivalException extends Exception {
    public String toString() {
        return "TrivalException";
    }
}

class AnotherException extends Exception {
    public String toString() {
        return "AnotherException";
    }
}