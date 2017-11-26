package twelve;

public class Exercise3 {
    public static void main(String[] args) {
        String[] arr = {"AA","BB"};
        try {
            System.out.println(arr[2]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
