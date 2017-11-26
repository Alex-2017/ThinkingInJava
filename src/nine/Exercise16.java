package nine;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by 10170 on 2017/10/12.
 */
public class Exercise16 {
    public static void main(String[] args){
        AdaptGenerateCharScanner AdaptGenerateCharScanner = new AdaptGenerateCharScanner(10);
        Scanner scanner = new Scanner(AdaptGenerateCharScanner);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}

class GenerateCharArr {
    private static java.util.Random random = new java.util.Random();
    private static char[] chars_1 = "AZXFSGJOKSADF".toCharArray();
    private static char[] chars_2 = "oajsdlfjalsjdflj".toCharArray();
    private static char[] chars_3 = "sjdfljljclibjlisdjfg".toCharArray();

    public char[] generCharArr() {
        char[] buffer = new char[10];
        int i = 0;
        buffer[i++] =chars_1[random.nextInt(chars_1.length)];
        for(int j =0;j<4;j++) {
            buffer[i++]=chars_2[random.nextInt(chars_2.length)];
            buffer[i++]=chars_3[random.nextInt(chars_3.length)];
        }
        buffer[i] = ' ';
        return buffer;
    }
}

class AdaptGenerateCharScanner extends GenerateCharArr implements Readable{

    private int count;

    public AdaptGenerateCharScanner(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        cb.put(generCharArr());
        return 0;
    }
}