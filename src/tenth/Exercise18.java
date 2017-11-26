package tenth;

public class Exercise18 {
    public static class NestClass{
        public void nest() {
            System.out.println("Hello,I'm NestClass.nest()");
        }
    }

    public static NestClass getNestClass() {
        return new NestClass();
    }

    public static void main(String[] args) {
        //嵌套类没有通过外部类来创建对象
        Exercise18.NestClass nestClass = new Exercise18.NestClass();
        nestClass.nest();
    }
}
