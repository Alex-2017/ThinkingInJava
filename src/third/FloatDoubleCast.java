package third;

import org.junit.Test;

/**
 * Created by 10170 on 2017/8/9.
 */
public class FloatDoubleCast {
    double above = 1.7;
    double below = 1.4;
    float fabove = 1.7f;
    float fbelow = 1.4f;
    @Test//由此例可见 浮点数转整数 是采取舍去的操作
    public void cast1(){
        System.out.println("(int)above:"+(int)above);
        System.out.println("(int)below:"+(int)below);
        System.out.println("(int)fabove:"+(int)fabove);
        System.out.println("(int)fbelow:"+(int)fbelow);
    }

    @Test//采用Math,round()方法 是对浮点数进行四舍五入操作
    public void cast2(){
        System.out.println("Math.round(above)"+Math.round(above));
        System.out.println("Math.round(below)"+Math.round(below));
        System.out.println("Math.round(fabove)"+Math.round(fabove));
        System.out.println("Math.round(fbelow)"+Math.round(fbelow));
    }

    @Test//当int 执行计算后的值超出int的数据范围后 结果会溢出
    public void intOverFlow(){
        int big =  Integer.MAX_VALUE;
        System.out.println("big:"+big);
        int biger = big*4;
        System.out.println("biger:"+biger);
    }
}
