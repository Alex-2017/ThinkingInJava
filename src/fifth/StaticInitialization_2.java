package fifth;

import org.junit.Test;

/**
 * Created by 10170 on 2017/10/8.
 */
public class StaticInitialization_2 {
    Table table = new Table();
    CupBoard cupBoard = new CupBoard();

    @Test
    public void staticInitial() {
        System.out.println("new a Table()");
        new Table();
        System.out.println("new a CupBoard()");
        new CupBoard();
    }
}
class Bowl{
    public Bowl(int mark) {
        System.out.println("Bowl("+mark+")");
    }
}

class Table{
    public static Bowl bowl_1 = new Bowl(1);
    public static Bowl bowl_2 = new Bowl(2);

    public Table() {
        System.out.println("Table Constructor");
    }
}

class CupBoard{
    public static Bowl bowl_3 = new Bowl(3);
    Bowl bowl_4 = new Bowl(4);

    public CupBoard() {
        System.out.println("CupBoard Constructor");
    }
}
