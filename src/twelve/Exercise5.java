package twelve;

public class Exercise5 {
    private static int count = 5;

    public static void f() throws Exception {
        if (count-- > 0) {
            throw new Exception("Exception---->"+count);
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                f();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println("Got Through");
            break;
        }
       System.out.println("executed successfully");
    }

}

