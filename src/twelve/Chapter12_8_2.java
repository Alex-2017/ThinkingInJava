package twelve;

public class Chapter12_8_2 {
    //try-finally 的使用
    public static void f(int i) {
        System.out.println("start f() method");
        try {
            System.out.println("Point 1");
            if (i == 1) {
                return;
            }
            System.out.println("Point 2");
            if (i == 2) {
                return;
            }
            System.out.println("Point 3");
            if (i == 3) {
                return;
            }
            System.out.println("End");
        } finally {
            System.out.println("performing cleanup");
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<5;i++) {
            f(i);
            System.out.println("=================");
        }
    }

}