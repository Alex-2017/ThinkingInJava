package fifth;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 10170 on 2017/8/24.
 */
public class Practice {
    class Practice1 {
        private String sing;
    }

    @Test
    public void practice1() {
        System.out.println("new Practice1 Object's sing is " + new Practice1().sing);
    }

    class Practice3 {
        Practice3() {
            System.out.println("Practice3 无参构造器");
        }

        Practice3(String string) {
            System.out.println("Practice4 重载有参构造器");
            System.out.println("传入参数为:" + string);
        }
    }

    @Test
    public void practice3() {
        Practice3 practice3 = new Practice3();
    }

    @Test
    public void practice4() {
        Practice3 practice3 = new Practice3("Practice4有参构造器传入参数");
    }

    class Dog {
        void bark(int i) {
            System.out.println("the dog is barking");
        }

        void bark(char a) {
            System.out.println("the dog is howling");
        }
    }

    @Test
    public void practice5() {
        Dog dog = new Dog();
        dog.bark(1);
        dog.bark('a');
    }

    class Dog2 {
        void bark(int i, char a) {
            System.out.println("the dog is barking");
        }

        void bark(char a, int i) {
            System.out.println("the dog is howling");
        }
    }

    @Test
    public void practice6() {
        Dog2 dog2 = new Dog2();
        dog2.bark(1, 'a');
        dog2.bark('a', 1);
    }

    class NoConstructor {
    }

    @Test
    public void practice7() {
        NoConstructor noConstructor = new NoConstructor();
    }

    class Practice8 {
        void method1() {
            System.out.println("Practice8 method1");
            method2("不使用this关键字");
            this.method2("使用this关键字");
        }

        void method2(String str) {
            System.out.println(str + "----使用Practice8 method2");
        }
    }

    @Test
    public void practice8() {
        Practice8 practice8 = new Practice8();
        practice8.method1();
    }

    class Practice9 {
        int num;
        String str;

        Practice9(int i) {
            System.out.println("构造器 int i " + i);
            num = i;
        }

        Practice9(String string) {
            this(100);//调用Practice9(int i)参数构造器
            System.out.println("构造器 string " + string);
            str = string;
        }

        Practice9() {
            this("this 调用构造器的使用");//调用Practice9(String string)构造器
        }

        public void printNumAndStr() {
            //this(1);编译器禁止在其他任何方法中调用构造器
            System.out.println("num:" + num + " ,str:" + str);
        }
    }

    @Test
    public void practice9() {
        Practice9 practice9 = new Practice9();
        practice9.printNumAndStr();
    }

    class Practice10 {
        protected void finalize() {
            System.out.println("Practice10 is realised");
        }
    }

    //不能保证jvm 垃圾回收器一定会执行
    @Test
    public void practice10() {
        Practice10 practice10 = new Practice10();
        System.gc();
        System.runFinalization();
    }

    @Test
    public void practice12() {
        Practice12 practice12Full = new Practice12();
        Practice12 practice12Empty = new Practice12();
        practice12Empty.empty();
        System.gc();
        System.runFinalization();
    }

    //类在初始化时，会先按类中变量的前后顺序加载变量
    @Test
    public void chapter5_7_1() {
        House house = new House();
        house.a();
    }

    class Window {
        Window(String str) {
            System.out.println("Window-" + str);
        }

        void w() {
            System.out.println("Window w方法被调用");
        }
    }

    class House {
        Window w1 = new Window("House初始化-1");

        public void a() {
            System.out.println("execute method a");
            w2.w();
        }

        Window w3 = new Window("House初始化-3");

        House() {
            Window w = new Window("House构造器初始化");
            w2.w();
        }

        //w2.w();  w2.w();语句在w2定义之前不可被调用 但是在方法和构造器中可以被使用，无论是在w2之前还是在w2之后
        Window w2 = new Window("House初始化-2");
    }

    @Test
    public void practice14() {
        Person person = new Person("自定义构造器初始化");
    }

    @Test
    public void practice15() {
        practice15 practice15 = new practice15();
    }

    class practice15 {
        String str;

        {
            str = "非静态实例初始化";
            System.out.println("参数str初始化完毕");
        }
    }

    //static变量只在类第一次初始化或者访问类的数据时初始化一次 此后不再初始化 直至程序结束
    @Test
    public void StaticDemo() {
        Person person1 = new Person("第一次加载Person");
        Person person2 = new Person("第二次加载Person");
    }

    @Test
    public void charpter5_8() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        //for (int i : a2) {
        //    i = i + 1;
        //}
        for (int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for (int i : a1) {
            System.out.println(i);
        }
    }

    @Test
    public void practice16() {
        String[] s1 = new String[5];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = "str" + i;
        }
        for (String str : s1) {
            System.out.println(str);
        }
    }

    //Practice16
    class Coffee {
        Coffee(String str) {
            System.out.println("this is Coffee Contructor" + str);
        }
    }

    @Test
    public void practice17() {
        Coffee[] coffees = new Coffee[10];
        for (int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee("str" + i);
        }
        System.out.println(Arrays.toString(coffees));
    }

    @Test
    public void charpter5_8_1() {
        //Chartpter5_8_1.varArgs(new String[]{"aaa", "bbb"});
        //Chartpter5_8_1.newVarArgs("111","222","333");
        //Chartpter5_8_1.newVarArgs(1,"1-111","2-222");
        Chartpter5_8_1.test1(1.1f, 'a', 'b');
        Chartpter5_8_1.test2('a', 'b');
    }

    @Test
    public void practice19() {
        Practice19.printVarArrays("AA", "BB", "CC");
        String[] strArr = new String[]{"11", "22", "33"};
        Practice19.printVarArrays(strArr);
    }

    @Test
    public void Practice20() {
        Practice20.main("hello", 11, 'a', 3.0f, 4.1111);
    }

    //charpter5_9 枚举类型
    public enum Spiciness {
        WARM, HOT, COMFORT, COLD
    }

    public class UseSpiciness {
        Spiciness spiciness;

        UseSpiciness(Spiciness spiciness) {
            this.spiciness = spiciness;
        }

        void swithch_case() {
            switch (spiciness) {
                case WARM:
                case HOT:
                    System.out.println("it is spring and summer");
                    break;
                case COMFORT:
                case COLD:
                    System.out.println("it is autumn and winter");
                    break;
                default:
                    System.out.println("it is not a season");
            }
            System.out.println("----分割线----");
        }
    }

    @Test
    public void charpter5_9_1() {
        //emum类的遍历 enum.values()创建enum中value的数组 value的ordinal()方法代表每个value在数组中的索引
        for (Spiciness spiciness : Spiciness.values()) {
            System.out.println("第" + spiciness.ordinal() + "个Spiciness的Value是" + spiciness);
        }
    }

    @Test
    public void charpter5_9_2() {
        UseSpiciness cold = new UseSpiciness(Spiciness.COLD),
                warm = new UseSpiciness(Spiciness.WARM),
                comfort = new UseSpiciness(Spiciness.COMFORT),
                hot = new UseSpiciness(Spiciness.HOT);
        cold.swithch_case();
        warm.swithch_case();
        comfort.swithch_case();
        hot.swithch_case();
    }

    public enum MoneyNum {
        ONE, TEN, HUNDRED, THOUSAND, TENTHOUSAND, BILLION
    }

    @Test
    public void testMoneyNum() {
        MoneyNum moneyNum = MoneyNum.BILLION;
        System.out.println(moneyNum);
    }

    @Test
    public void practice21() {
        for (MoneyNum moneyNum : MoneyNum.values()) {
            System.out.println("ordinal is " + moneyNum.ordinal() + " value is " + moneyNum);
        }
    }

    class Practice22 {
        void switch_money(MoneyNum moneyNum) {
            switch (moneyNum) {
                case ONE:
                case TEN:
                case HUNDRED:
                    System.out.println("these is a little money");
                    break;
                case THOUSAND:
                case TENTHOUSAND:
                    System.out.println("these is a lot money");
                    break;
                default:
                    System.out.println("these is very much money");

            }

        }
    }

    @Test
    public void practice22() {
        MoneyNum one = MoneyNum.ONE,
                ten = MoneyNum.TEN,
                hundred = MoneyNum.HUNDRED,
                thousand = MoneyNum.THOUSAND,
                tenthousand = MoneyNum.TENTHOUSAND,
                billion = MoneyNum.BILLION;
        Practice22 practice22 = new Practice22();
        practice22.switch_money(one);
        practice22.switch_money(thousand);
        practice22.switch_money(tenthousand);
        practice22.switch_money(billion);
    }

    @Test
    public void test() {
        System.out.print("aaaa");
        System.out.print("------");
    }
}

//Practice20
class Practice20 {
    public static void main(Object... args) {
        for (Object obj : args) {
            System.out.println(obj.toString());
        }
    }
}

//practice19
class Practice19 {
    static void printVarArrays(String... args) {
        for (String str : args) {
            System.out.print(str);
        }
        //System.out.println("--------");
    }
}

//charpter5_8_1
class Chartpter5_8_1 {

    static void varArgs(String[] args) {
        for (String str : args) {
            System.out.println(args);
        }
        System.out.println(args.getClass());
    }

    //可变参数列表 ...args 才能使用("aaa","bbb") 数据格式直接传值
    static void newVarArgs(String... args) {
        for (String str : args) {
            System.out.println(str);
        }
        System.out.println(args.getClass());
    }

    static void newVarArgs(int num, String... args) {
        System.out.println("newVarArgs对应参数" + num);
        for (String str : args) {
            System.out.println(str);
        }
        System.out.println(args.getClass());
    }

    static void test1(float f, Character... args) {
        System.out.println("firsttest1");
    }

    static void test2(Character... args) {
        System.out.println("secondtest2");
    }
}

class Practice12 {
    private static int counter;
    int i = counter++;
    boolean full;

    public Practice12() {
        System.out.println("Practice12---" + i + "创建");
        full = false;
    }

    public void empty() {
        full = false;
    }

    protected void finalize() {
        if (full) {
            System.out.println("Practice12 is full,can not clean up!");
        } else {
            System.out.println("Practice12 cleaned up!");
        }
    }
}

//Practice14
class Love {
    Love() {
        System.out.println("Love Class Initial");
    }

    Love(int i) {
        System.out.println("Love-" + i + "-Class will be initial");
    }
}

class Person {
    public static Love love1 = new Love(1);
    static Love love;

    static {
        love = new Love();
    }

    String words;

    Person(String words) {
        System.out.println(words);
    }
}