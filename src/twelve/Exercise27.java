package twelve;

public class Exercise27 {
    public static void main(String[] args) {
        int[] ints = {1, 2};
        try {
            System.out.println(ints[2]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
