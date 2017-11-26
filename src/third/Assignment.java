package third;

/**
 * Created by 10170 on 2017/7/24.
 */
class Tank{
    int level;
}
public class Assignment {
    public static void main(String[] args){
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level = 20;
        tank2.level = 40;
        System.out.println("1: tank1.level is "+ tank1.level+" tank2 level is "+tank2.level);
        tank1 = tank2;
        System.out.println("2: tank1.level is "+ tank1.level+" tank2 level is "+tank2.level);
        tank2.level = 10;
        System.out.println("3: tank1.level is "+ tank1.level+" tank2 level is "+tank2.level);
        tank1.level = 5;
        System.out.println("4: tank1.level is "+ tank1.level+" tank2 level is "+tank2.level);
    }
}
