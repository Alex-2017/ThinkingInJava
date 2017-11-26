package sixth.debug;

/**
 * Created by 10170 on 2017/9/7.
 */
public class Cookie {
    public Cookie() {
        System.out.println("Cookie Constructor");
    }

    //将此方法设置为protected后 其余包的子类即可调用此方法
    protected void send() {
        System.out.println("cookie send");
    }
}
