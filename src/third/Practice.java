package third;

import org.junit.Test;

import java.util.Random;

/**
 * Created by 10170 on 2017/8/8.
 */
public class Practice {
    //practice5
    class Dog {
        private String name;
        private String says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Dog dog = (Dog) o;

            if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
            return says != null ? says.equals(dog.says) : dog.says == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (says != null ? says.hashCode() : 0);
            return result;
        }
    }

    @Test
    public void practice5And6() {
        Dog dog1 = new Dog("spot", "Ruff");
        Dog dog2 = new Dog("scruffy", "Wurf");
        //practice 5
        System.out.println("dog1-name:" + dog1.name + "-says-" + dog1.says);
        System.out.println("dog2-name:" + dog2.name + "-says-" + dog2.says);
        //practice 6
        Dog dog3 = dog1;
        Dog newDog = new Dog("spot", "Ruff");
        System.out.println("dog3==dog1----" + (dog1 == dog3));
        System.out.println("dog3.equals(dog1)----" + dog1.equals(dog3));
        System.out.println("newDog==dog1----" + (newDog == dog3));
        System.out.println("newDog.equals(dog1)----" + newDog.equals(dog3));
    }

    @Test
    public void practice7() {
        java.util.Random rendom = new Random();
        while (true){
        int num = rendom.nextInt(6)+1;
        System.out.println(num);
        if (num > 0 && num <= 3)
            System.out.println("小");
        else
            System.out.println("大");
        }
    }

    @Test
    public void practice14(){
        compareString("AA","BB");
        compareString("11","BB");
        compareString("11","11");
    }
    private void compareString(String a,String b){
        System.out.println("a==b?:"+(a==b));
        System.out.println("a.equals(b)?:"+a.equals(b));
    }

    @Test
    public void parctice14answer(){
        compare("Hello", "Hello");//true false true
        String str1 = new String("Hello");
        String str2 = "Hello";
        String str3 = "GoodBye";
        compare("Hello", str1);//false true true
        compare("Hello", str2);//true false true
        compare("Hello", str3);//false true false
    }

    public static void p(String s, boolean flag){
        System.out.println(s + ":" + flag);
    }

    public static void compare(String lval, String rval) {
        System.out.println("lval:"+lval+"rval:"+rval);
        p(lval+"=="+rval, lval == rval);
        p(lval+"!="+rval, lval != rval);
        p(lval+".equals("+rval+")", lval.equals(rval));
    }
}