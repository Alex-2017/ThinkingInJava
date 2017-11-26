package tenth;

public class Exercise19_Nest {
    public static class NestClass {
        public static class NestClass_1{
            public void nest_1() {
                System.out.println("Exercise19_Nest.NestClass.NestClass_1.nest_1()");
            }
        }

        public void nest() {
            System.out.println("Exercise19_Nest.NestClass.nest()");
        }
    }

    public static NestClass.NestClass_1 getNestClass_1() {
        return new NestClass.NestClass_1();
    }

    public static NestClass getNestClass() {
        return new NestClass();
    }

    public static void main(String[] args) {
        Exercise19_Nest.NestClass nestClass = getNestClass();
        nestClass.nest();
        Exercise19_Nest.NestClass.NestClass_1 nestClass_1 = getNestClass_1();
        nestClass_1.nest_1();
    }
}
