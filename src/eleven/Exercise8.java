package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise8 {


    public static void main(String[] args) {
        List<Life> lifeList = new ArrayList<>(Arrays.asList(new Life(), new Life(), new Life(), new Life(), new Life(), new Life(), new Life(), new Life()));
        //Iterator<Life> iterator = lifeList.iterator();
        for (Iterator<Life> iterator = lifeList.iterator(); iterator.hasNext(); iterator.next().hop()) ;
    }
}

class Life {
    public static int i;
    private int id = i++;

    public void hop() {
        System.out.println("Life-" + id);
    }

}