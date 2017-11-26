package twelve;

public class Chapter12_8 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            try {
                if (count++ == 0) {
                    throw new Chapter12_8Exception();
                } else {
                    System.out.println("There is no Exception");
                }
            } catch (Chapter12_8Exception e) {
                System.out.println("Catch the Exception " + count);
            }finally {
                System.out.println("finally clause");
                if (count == 2) {
                    break;
                }
            }
        }
    }
}

class Chapter12_8Exception extends Exception {

}
