package twelve;

import java.util.Arrays;

//try-catch-finally的使用
public class Exercise13 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(Arrays.toString(str.getBytes()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally caluse");
        }
    }


}
