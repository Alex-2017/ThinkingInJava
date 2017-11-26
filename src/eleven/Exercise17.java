package eleven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise17 {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("AAA", new Gerbil());
        map.put("BBB", new Gerbil());
        map.put("CCC", new Gerbil());
        //我的代码
        Iterator<String> keyIter = map.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            System.out.println("key->" + key);
            map.get(key).hop();
        }
        System.out.println("========================================");
        //答案代码  使用Iterator<Entry<>>来遍历Map
        Iterator<Map.Entry<String, Gerbil>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Gerbil> entryMap = iterator.next();
            System.out.println(entryMap);
            entryMap.getValue().hop();
        }
        System.out.println("----------------------------------------");
        //第三种方式 java8流遍历
        map.forEach((k,v)-> System.out.println(k+"---->"+v));
    }
}
