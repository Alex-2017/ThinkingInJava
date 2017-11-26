package sixth.debug;

/**
 * Created by 10170 on 2017/9/10.
 */
public class Connection {
    private static int counter = 0;
    private int i = counter;

    private Connection() {
        System.out.println("Connection()");
    }

    static Connection makeConnection() {
        counter++;
        return new Connection();
    }

    public static int howMany() {
        return counter;
    }

    public String toString() {
        return "Connectin " + i;
    }

    public static void main(String[] args){
        Connection connection = makeConnection();
        System.out.println(connection);
    }
}
