package twelve;

public class Chapter12_9 extends Inning implements Storm {

    //派生类构造器的异常说明必须包含父类构造器抛出的异常信息 否则报错 随后可以自定义添加异常信息 比如可以添加InterfaceExceptionChild_A等等
    public Chapter12_9() throws BaseException, InterfaceException {
    }

    //event()方法 在父类和实现的接口中都存在 父类抛出的异常会和接口中抛出的异常产生冲突 为了避免冲突 不再throws任何异常
    @Override
    public void event() {
    }

    //atBat()仅在父类中存在 所以可以不抛出任何异常 默认调用父类抛出的异常信息 也可以手动添加异常信息 但是抛出的异常必须是父类抛出异常的子类
    @Override
    public void atBat() throws BaseExceptionChild_A {

    }

    //rainHard()方法只存在于接口中 和atBat()相同 要么默认调用接口抛出的异常信息 或者 抛出接口抛出的异常的子类异常信息
    @Override
    public void rainHard() throws InterfaceExceptionChild_A {

    }

    public static void main(String[] args) {
        Chapter12_9 chapter12_9 = null;
        try {
            //调用了new Chapter12_9()构造器 抛出其构造器抛出的异常信息
            chapter12_9 = new Chapter12_9();
        } catch (BaseException | InterfaceException e) {
            e.printStackTrace();
        }

        //当Chapter12_9调用atbat方法 抛出异常是自身定义的异常 不用抛出父类中声明抛出的异常
        try {
            chapter12_9.atBat();
        } catch (BaseExceptionChild_A baseExceptionChild_a) {
            baseExceptionChild_a.printStackTrace();
        }

        Inning inning = null;
        try {
            //调用了new Chapter12_9()构造器 抛出其构造器抛出的异常信息
            inning = new Chapter12_9();
        } catch (BaseException | InterfaceException e) {
            e.printStackTrace();
        }

        //当Chapter12_9想上转型为 Inning后 调用atBat 抛出了在父类中定义的异常
        try {
            inning.atBat();
            //catch异常新语法
        } catch (BaseExceptionChild_A | BaseExceptionChild_B baseExceptionChild_a) {
            baseExceptionChild_a.printStackTrace();
        }

    }
}

class BaseException extends Exception {

}

class BaseExceptionChild_A extends BaseException {
}

class BaseExceptionChild_B extends BaseException {

}

abstract class Inning {
    public Inning() throws BaseException {

    }

    public void event() throws BaseException {

    }

    public abstract void atBat() throws BaseExceptionChild_A, BaseExceptionChild_B;

    public void walk() {

    }
}

class InterfaceException extends Exception {

}

class InterfaceExceptionChild_A extends InterfaceException {

}

class BaseExceptionChild_B_Child extends BaseExceptionChild_B {

}

interface Storm {
    public void event() throws InterfaceExceptionChild_A;

    public void rainHard() throws InterfaceExceptionChild_A;
}



