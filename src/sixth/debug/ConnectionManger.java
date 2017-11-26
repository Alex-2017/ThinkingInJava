package sixth.debug;

/**
 * Created by 10170 on 2017/9/10.
 */
public class ConnectionManger {
    static int howManyLeft  = 3;
    static Connection[] ca = new Connection[3];
    static {
        for (int i=0;i<ca.length;i++) {
            ca[i] = Connection.makeConnection();
        }
    }

    public static Connection getConnection (){
        if (howManyLeft > 0) {
            return ca[--howManyLeft];
        }else{
            System.out.println("No More Connection");
            return null;
        }
    }

    public static void main(String[] args){
        System.out.println(howManyLeft);
        System.out.println(getConnection());
        System.out.println(howManyLeft);
        System.out.println(getConnection());
        System.out.println(howManyLeft);
        System.out.println(getConnection());
        System.out.println(howManyLeft);
        System.out.println(getConnection());


        /*ConnectionManger cm = new ConnectionManger();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(cm.getConnection());
        System.out.println(howManyLeft);*/
    }
}
