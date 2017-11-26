package sixth.debugoff;

import sixth.debug.Cookie;

/**
 * Created by 10170 on 2017/9/7.
 */
public class Pizza extends Cookie{
    public Pizza() {
        System.out.println("Pizza Constructor");
    }

    void eat() {
        System.out.println("eat pizza");
        send();//将在不同包下的Cookie父类中的send（）方法改为protected后 即可调用此方法
    }

    //子类 创建实例时 会先实现父类的构造器
    public static void main(String[] args){
        Pizza pizza = new Pizza();
        pizza.eat();
    }
}
