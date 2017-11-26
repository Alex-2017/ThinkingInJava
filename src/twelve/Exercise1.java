package twelve;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            System.out.println("throw a exception");
            //通过构造器自定义异常信息
            throw new Exception("customed exception");
        } catch (Exception e) {
            //输出自定义异常信息
            System.out.println("Exception message is "+ e.getMessage());
        }finally {
            System.out.println("executed in finally block");
        }
    }
}
