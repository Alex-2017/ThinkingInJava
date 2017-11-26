package nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 10170 on 2017/10/10.
 */
public class A_9_3 {

    public void apply(Process process, Object input) {
        System.out.println("Using Process "+process.name());
        System.out.println(process.process(input));
    }

    @Test
    public void test() {
        String input = "Fake It Until You Made It";
        apply(new Downcase(),input);
        apply(new Upcase(),input);
        apply(new Splitter(),input);
    }
}
class Process{
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class Downcase extends Process {
    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}
class Upcase extends Process {
    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Splitter extends Process {
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


