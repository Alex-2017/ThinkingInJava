package twelve;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise7 {
    private static Logger logger = Logger.getLogger("loggerArrayIndexBoundException");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        int[] ints = new int[5];
        try {
            ints[5] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
