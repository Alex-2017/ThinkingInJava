package twelve;

public class Exercise25 {
    public static void main(String[] args) {
        A c = new C();
        try {
            c.f();
        } catch (LevelA_Exception e) {
            //编译器强制要求catch 基类中f()方法抛出的异常
            //LevelC_Exception 是 LevelA_Exception的子类 可直接用LevelA_Exception来捕获异常
            //同时印证了Chapter12_9中 父类和子类抛出异常的规则
            e.printStackTrace();
        }
    }
}

class LevelA_Exception extends Exception {
}

class LevelB_Exception extends LevelA_Exception {
}

class LevelC_Exception extends LevelB_Exception {
}

class A {
    public void f() throws LevelA_Exception {
        throw new LevelA_Exception();
    }
}

class B extends A {
    @Override
    public void f() throws LevelB_Exception {
        throw new LevelB_Exception();
    }
}

class C extends B {
    @Override
    public void f() throws LevelC_Exception {
        throw new LevelC_Exception();
    }
}

