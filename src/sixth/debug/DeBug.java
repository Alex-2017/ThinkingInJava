package sixth.debug;

/**
 * Created by 10170 on 2017/9/7.
 */
public class DeBug {
    public void debug() {
        System.out.println("开发调试版本!");
    }


    public static void main(String[] args){
        Cookie cookie = new Cookie();
        cookie.send();//send 方法为protected时 仍能被同个包下的类访问
    }
}
