package nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 10170 on 2017/10/10.
 */
public class B_9_3 {
    public void apply(Process_1 process, Object input) {
        System.out.println("Using Process is "+process.name());
        System.out.println(process.process(input));
    }

    @Test
    public void test() {
        String s = "This Is Another Day";
        //根据实际情况 设计不同的模式 为了降低代码之间的耦合性

        apply(new Downcase_1(), s);
        apply(new Upcase_1(), s);
        apply(new Splitter_1(), s);

        apply(new Waveform_child1(), new Waveform());
        apply(new Waveform_child2(), new Waveform());
        apply(new Waveform_child3(), new Waveform());
    }

    @Test
    public void test1() {
        System.out.println(new Waveform().toString());
    }
}
interface Process_1{
    String name();

    Object process(Object input);
}

//创建抽象类TemplateProcess实现接口,其中非抽象方法name 可被复用  抽象方法process则由继承抽象类的导出类Upcase_1，Downcase_1，Splitter_1实现从而达到类的多态性
abstract class TemplateProcess implements Process_1 {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object input);
}

class Upcase_1 extends TemplateProcess {

    @Override
    public Object process(Object input) {
        return (input.toString()).toUpperCase();
    }
}

class Downcase_1 extends TemplateProcess {

    @Override
    public Object process(Object input) {
        return (input.toString()).toLowerCase();
    }
}

class Splitter_1 extends TemplateProcess {

    @Override
    public Object process(Object input) {
        return Arrays.toString(input.toString().split(" "));
    }
}

//直接创建新的非抽象类实现接口 子类直接继承该类 代码复用
class Waveform{
    private static long counter;
    private final long id = ++counter;

    public String toString() {
        return "Waveform " + id;
    }
}

class WaveformProcess implements Process_1 {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return (Waveform)input;
    }
}

class Waveform_child1 extends WaveformProcess {

}
class Waveform_child2 extends WaveformProcess {

}
class Waveform_child3 extends WaveformProcess {

}
