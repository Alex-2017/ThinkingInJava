package nine;

import org.junit.Test;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by 10170 on 2017/10/12.
 */
public class A_9_6 {

    @Test
    public void test1(){
        RandomWords randomWords = new RandomWords(10);
        Scanner scanner = new Scanner(randomWords);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    @Test
    public void test2() {
        RandomDoubles doubles = new RandomDoubles();
        for(int i=0;i<10;i++) {
            System.out.println(doubles.getDouble()+ " ");
        }
    }

    @Test
    public void test3() {
        AdaptRandomDoubles adaptRandomDoubles = new AdaptRandomDoubles(10);
        Scanner scanner = new Scanner(adaptRandomDoubles);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}


//test1
class RandomWords implements Readable {

    private static char[] capitals = "AEXFESFSFAF".toCharArray();
    private static char[] lowers = "jijeljalsjdfajlsdfj".toCharArray();
    private static char[] vowels = "ajfhzjheq".toCharArray();
    private static Random random = new Random(47);

    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {

        if (count-- == 0) {
            return -1;
        } else {
            cb.append(capitals[random.nextInt(capitals.length)]);
            for(int i =0;i<4;i++) {
                cb.append(lowers[random.nextInt(lowers.length)]);
                cb.append(vowels[random.nextInt(vowels.length)]);
            }
            cb.append(" ");
            return 2;
        }
    }
}

//test2
class RandomDoubles{
    private static Random random = new Random(47);

    public double getDouble() {
        return random.nextDouble();
    }
}

//test3 创建一个新类 既实现Readable接口 又在实现中使用RandomDoubles中的方法
//所以就可以创建一个既是RandomDoubles又是Readable的新类
class AdaptRandomDoubles extends RandomDoubles implements Readable{
    private int count;

    public AdaptRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }else{
            cb.append(getDouble() + " ");
            return 0;
        }
    }
}

