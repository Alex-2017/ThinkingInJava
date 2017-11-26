package eighth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/9/27.
 */
public class Personal {
    @Test
    public void test() {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.walk();
        b.walk();
        c.walk();
        d.walk();
        d.fly();
    }


    //共享对象的方法调用 多个对象共享同个对象，运用计数器在来控制共享对象的垃圾回收
    @Test
    public void test1() {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing composing : composings) {
            System.out.println(composing + "'s shared refcount is " + composing.shared.getRefcount());
            composing.dispose();
        }
    }


    //协变返回类型，允许返回更加具体的导出类类型
    @Test
    public void test2() {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(grain);
        mill = new WheatMill();
        grain = mill.process();
        System.out.println(grain);
    }

    //域的访问由编译器进行解析，不具有多态性
    @Test
    public void test3() {
        Father father = new Son();
        System.out.println("father.age is " + father.age);
        System.out.println("father.getAge() is " + father.getAge());
        Son son = new Son();
        System.out.println("son.age is "+son.age);
        System.out.println("son.getAge() is "+son.getAge());
        System.out.println("son.getFatherAge() is "+ son.getFatherAge());
    }
}

class A {
    void walk() {
        System.out.println("A---walk");
    }

    void fly() {
        System.out.println("A---fly");
    }
}

class B extends A {
    @Override
    void walk() {
        System.out.println("B---walk");
    }
}

class C extends B {

}

class D extends C {

}

class Shared {
    private int refcount = 0;
    private static long counter = 1;//对象计数器
    private final long id = counter++;//记录当前对象是生成的第几个对象

    public Shared() {
        System.out.println("Shared " + id + " Constructed");
    }

    public String toString() {
        return "Shared " + id;
    }

    public void addRefcount() {
        refcount++;
    }

    public int getRefcount() {
        return refcount;
    }

    public void dispose() {
        if (--refcount == 0) {
            System.out.println("Shared disposed");
        }
    }
}

class Composing {
    private static long counter = 1;
    private final long id = counter++;
    public Shared shared;

    public Composing(Shared shared) {
        System.out.println("Composing Constructor " + id);
        this.shared = shared;
        this.shared.addRefcount();
    }

    public void dispose() {
        System.out.println("Composing " + id + " disposed");
        this.shared.dispose();
    }

    public String toString(){
        return "Composing "+ id;
    }
}

class Grain {
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    public Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    public Wheat process() {
        return new Wheat();
    }
}

class Father {
    public int age = 44;

    public String getAge() {
        return ""+age;
    }
}

class Son extends Father {
    public int age = 15;

    @Override
    public String getAge() {
        return " " + age;
    }

    public String getFatherAge() {
        return super.getAge();
    }
}