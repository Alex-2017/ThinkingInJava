package twelve;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise6 {
    @Test
    public void test1() {
        try {
            throw new LogginException1();
        } catch (LogginException1 logginException1) {
            System.err.println("Caught " + logginException1);
        }
        try {
            throw new LogginException2();
        } catch (LogginException2 logginException2) {
            System.err.println("Caught " + logginException2);
        }
    }
}


class LogginException1 extends Exception {
    private static Logger logger = Logger.getLogger("loggingException1");

    public LogginException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class LogginException2 extends Exception {
    private static Logger logger = Logger.getLogger("loggingException2");

    public LogginException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
