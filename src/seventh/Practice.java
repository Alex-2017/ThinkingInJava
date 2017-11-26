package seventh;

import org.junit.Test;

/**
 * Created by 10170 on 2017/9/12.
 */

class Dog {
    private String s;

    public Dog() {
        s = "Wang";
    }

    public String toString() {
        return s;
    }
}

class Animal {
    private Dog dog;

    Animal() {
        System.out.println("inside Animal Constructor");
        dog = new Dog();
    }

    public String toString() {
        return "Animal:dog=" + dog;
    }

    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println(animal);
    }
}


public class Practice {



    @Test
    public void practice1() {
        Animal animal = new Animal();
        System.out.println(animal);
    }

    @Test
    public void practice2_1() {
        Detergent detergent = new Detergent();
        detergent.apple();
        detergent.balana();
        detergent.orange();
        System.out.println(detergent);
        Cleanser.main(null);
    }

    @Test
    public void practice2_2() {
        Practice2 practice2 = new Practice2();
        practice2.apple();
        practice2.grape();
        System.out.println(practice2);
    }

    class Art {
        public Art() {
            System.out.println("Art constructor!");
        }
    }

    class Drawing extends Art {
        public Drawing() {
            System.out.println("Drawing constructor!");
        }
    }

    class Cartoon extends Drawing {
        //public Cartoon() {
        //    System.out.println("Cartoon constructor!");
        //}
        //public static void main(String[] args){
        //    Cartoon cartoon = new Cartoon();
        //    System.out.println("Cartoon main Method()");
        //}
    }

    @Test
    public void practice3() {
        Cartoon cartoon = new Cartoon();
        System.out.println("practice3---");
    }

    //无参构造器 继承之间的调用关系
    class A {
        public A() {
            System.out.println("A constructor!");
        }
    }

    class B {
        public B() {
            System.out.println("B constructor!");
        }
    }

    class C extends A {
        private B b = new B();
    }

    @Test
    public void practice5() {
        C c = new C();
    }

    //有参构造器
    class Game {
        public Game() {
            System.out.println("no param Game Constructor");
        }

        public Game(int i) {
            System.out.println("Game constructor!");
        }
    }

    class BoardGame {
        public BoardGame(int i) {
            System.out.println("BoardGame constructor!");
        }
    }

    class Chess extends Game {
        BoardGame boardGame = new BoardGame(1);

        public Chess(int i) {
            super(i);//当继承的父类没有无参构造器或者默认构造器时，需要super(i);语句显式调用父类构造器 否则会报父类中无默认构造器的错误信息
            System.out.println("Chess constructor!");
        }
    }

    @Test
    public void practice7() {
        Chess chess = new Chess(1);
    }

    //practice8
    class Person {
        public Person(int i) {
            System.out.println("Person constructor!");
        }
    }

    class Child extends Person {
        public Child(int i) {
            super(i);
            System.out.println("Child haveParamConstructor!");
        }

        public Child() {
            super(1);
            System.out.println("Child noParamConstructor!");
        }
    }

    //practice9 and practice10
    class Component1 {
        public Component1(int i) {
            System.out.println("Component1 constructor!");
        }
    }

    class Component2 {
        public Component2(int i) {
            System.out.println("Component2 constructor!");
        }
    }

    class Component3 {
        public Component3(int i) {
            System.out.println("Component3 constructor!");
        }
    }

    class Root {
        Component1 component1 = new Component1(1);
        Component2 component2 = new Component2(2);
        Component3 component3 = new Component3(3);

        public Root(int i) {
            System.out.println("ROOT constructor!");
        }
    }

    class Steam extends Root {
        public Steam(int i) {
            super(i);
            System.out.println("Steam constructor!");
        }
    }

    @Test
    public void practice9() {
        //Steam steam = new Steam();
        Steam steam = new Steam(10);
    }

    @Test
    public void practice11() {
        DetergentProxy detergentProxy = new DetergentProxy();
        detergentProxy.apple();
        System.out.println(detergentProxy);
    }

    //practice13
    class Practice13Par{
        public void job() {
            System.out.println("family()");
        }
        public void job(String s) {
            System.out.println("healthy()");
        }
        public void job(double d) {
            System.out.println("money()");
        }
    }

    class Practice13Chi extends Practice13Par {
        public void job(int i) {
            System.out.println("重载父类方法");
        }

        @Override//复写方法 注解
        public void job(double d) {
            System.out.println("safety feeling");
        }
    }

    @Test
    public void practice13() {
        Practice13Chi practice13Chi = new Practice13Chi();
        practice13Chi.job();
        practice13Chi.job("aaa");
        practice13Chi.job(2.0);
        practice13Chi.job(1);
    }

    class Amphibian {
        public void say() {
            System.out.println("Amphibian said");
        }

        public void done(){
            System.out.println("Amphibian done");
        }
    }

    class Frog1 extends Amphibian {

    }

    class Frog2 extends Amphibian {
        @Override
        public void say() {
            System.out.println("Frog2 said");
        }

        @Override
        public void done() {
            System.out.println("Frog2 said");
        }

        public void ownMethod() {
            System.out.println("Frog2 OwnMethod");
        }
    }


    @Test
    public void practice16() {
        Amphibian amphibian = new Frog1();
        amphibian.say();
        amphibian.done();
    }

    //两者经过比较后发现 子类向上转型成基类后，会丢失自身不属于父类的方法 如Frog2中的ownMethod方法
    //但是子类自身重写父类的方法，却得到了保留
    @Test
    public void practice17() {
        Amphibian amphibian = new Frog2();
        amphibian.say();
        amphibian.done();
        //amphibian.ownMethod();
    }

    @Test
    public void practice18() {
        Practice18 practice18_1 = new Practice18();
        Practice18 practice18_2 = new Practice18();
        System.out.println(practice18_1);
        System.out.println(practice18_2);
    }

    @Test
    public void practice19() {
        WithFinal withFinal = new WithFinalChild();
        withFinal.p();
    }

    @Test
    public void practice23() {
        Practice23.userStaticMethod();
    }
}

class Practice18{
    private static java.util.Random random = new java.util.Random();
    private final int i = random.nextInt(10);
    private static final int j = random.nextInt(10);

    public String toString() {
        return "Practice18: i " + i+" j: " + j;
    }
}


//practice2
class Cleanser{
    private String s = "Cleanser";
    public void append(String s){
        this.s+=s;
    }

    public void apple() {
        append(" apple()");
    }

    public void orange() {
        append(" orange()");
    }

    public void balana() {
        append(" balana()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args){
        Cleanser cleanser = new Cleanser();
        cleanser.apple();
        cleanser.orange();
        cleanser.balana();
        System.out.println(cleanser);
    }
}

class Detergent extends Cleanser{
    public void apple() {
        append(" Detergent.apple()");
        super.apple();
    }
}

//practice11 修改类Detergent.java 由继承Cleanser.java变为代理Cleanser.java
class DetergentProxy{
    private Cleanser cleanser = new Cleanser();
    public void apple() {
        cleanser.append(" DetergentProxy apple()");
        cleanser.apple();
    }

    public void orange() {
        cleanser.orange();
    }

    public void balana() {
        cleanser.balana();
    }

    public String toString() {
        return cleanser.toString();
    }
}

class Practice2 extends Detergent{
    public void apple() {
        append(" this apple()method has been overwrite by Practice2");
    }

    public void grape() {
        append(" grape()");
    }
}

class WithFinal{
    private final void f() {
        System.out.println("WithFinal.f()");
    }

    private void g() {
        System.out.println("WithFinal.g()");
    }

    public final void p_final() {
        System.out.println("WithFinal.p_final()");
    }

    public void p() {
        System.out.println("WithFinal.p()");
    }
}

class WithFinalChild extends WithFinal {

    @Override
    public void p() {
        System.out.println("WithFinalChild.p()");
    }

    //@Override
    //public final void p_final() {
    //
    //}
}

class Practice23 {
    static {
        System.out.println("load static method");
    }

    public static void userStaticMethod() {
        System.out.println("user userStaticMethod method");
    }
}
//复用类 147
class Insect {
    private int i = 11;
    protected int j;

    public static int getStaticNumber(String string) {
        System.out.println(string+" getStaticNumber");
        return 33;
    }

    private static int k = getStaticNumber("Insect k");



    public Insect() {
        System.out.println("Insect constructor");
        System.out.println("i : "+i+" j :"+j+" k :"+k);
        j=22;
    }
}

class Mosquito extends Insect{
    private int i = getStaticNumber("Mosquito i");
    private static int k = getStaticNumber("Mosquito k");

    Mosquito() {
        System.out.println("Mosquito constructor");
        System.out.println("i : "+i+" j :"+j+" k :"+k);
    }
    public static void main(String[] args){
        //执行此方法时 编译器会根据继承类的顺序，从上往下初始化static域
        //System.out.println("==================");

        //创建Mosquito对象时 先初始化基类Insect类的变量，调用其构造器。随后再初始化子类Mosquito类的变量，调用其构造器
        Mosquito mosquito = new Mosquito();
    }
}

class Space{
    private  int j =1;
}
class SpaceShip extends Space{
    public static void main(String[] args){
        SpaceShip spaceShip = new SpaceShip();
        //System.out.println(spaceShip.);
    }
}