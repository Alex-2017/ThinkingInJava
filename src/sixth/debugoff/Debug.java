package sixth.debugoff;

import sixth.debug.Cookie;

/**
 * Created by 10170 on 2017/9/7.
 */
public class Debug {
    public void debug() {
        System.out.println("发布版本,禁止调试!");
    }

    public static void main(String[] args){
        Cookie cookie = new Cookie();
        //当不在同个包下且不是子类时 protected修饰的send方法不能被调用
    }
}
