package eighth;

/**
 * Created by 10170 on 2017/10/8.
 */

public class GirlFriend {
    private int age = 18;
    private int weight = 55;
    private int height = 175;

    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        System.out.println("This is my girlfriend =-= "+girlFriend);
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
