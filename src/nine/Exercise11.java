package nine;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/11.
 */
public class Exercise11 {
    public void apply(Human human,Object input){
        System.out.println("Human is "+human.name());
        System.out.println(human.process(input));
    }

    @Test
    public void exercise11() {
        Human swapHumanChar = new SwapCharacterHumanAdapter();
        apply(swapHumanChar,"12345");
        apply(swapHumanChar,"abcd");
    }
}
interface Human{
    String name();

    Object process(Object input);
}

class SwapCharacter{
    public static String swapChar(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        //i<stringBuilder.length()-1 避免奇数位字符串时 charAt方法出现数组越界异常
        for(int i=0;i<stringBuilder.length()-1;i+=2) {
            char c1 = stringBuilder.charAt(i);
            char c2 = stringBuilder.charAt(i+1);
            stringBuilder.setCharAt(i,c2);
            stringBuilder.setCharAt(i+1,c1);
        }
        return stringBuilder.toString();
    }
}

//实现接口 起着适配器作用
class SwapCharacterHumanAdapter implements Human {

    @Override
    public String name() {
        return SwapCharacter.class.getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return SwapCharacter.swapChar(input.toString());
    }
}