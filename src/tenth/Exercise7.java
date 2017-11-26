package tenth;

public class Exercise7 {
    private String str = "未更改";

    private void printStr() {
        System.out.println("printStr-"+str);
    }

    private void changeInt() {
        Inner inner = new Inner();
        //外部类也可以访问内部类私有方法和变量,但需要创建内部类对象
        inner.i = 20;
    }

    class Inner{
        private int i = 10;
        //内部类可直接访问外部类私有方法和变量.
        void modifyStr() {
            str = "已更改";
            System.out.println("Inner-"+str);
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        exercise7.printStr();
        Inner inner = exercise7.getInner();
        inner.modifyStr();
        exercise7.changeInt();
        System.out.println("inner.i is "+ inner.i);
    }
}
