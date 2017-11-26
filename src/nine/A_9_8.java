package nine;

/**
 * Created by 10170 on 2017/10/16.
 */
public class A_9_8 {
    public static void main(String[] args){
        InsideInterface inter = new InsideInterface();

        InsideInterface.Inside_1 inside_1= inter.getInside_1();
        InsideInterface.Imp_1 imp_1 = inter.getImp1();

        InsideInterface.Inside_2 inside_2= inter.getInside_2();
        InsideInterface.Imp_2 imp_2 = inter.getImp2();

        //仅有 Inside_3 无法被创建实例 因为其是在InsideInterface中是private权限
        //InsideInterface.Inside_3 inside_3= inter.getInside_3();
        InsideInterface.Imp_3 imp_3 = inter.getImp3();
    }
}

class InsideInterface{
    public interface Inside_1{
        
    }
    
    public class Imp_1 implements Inside_1{
        
    }

    public Inside_1 getInside_1() {
        return new Imp_1();
    }

    public Imp_1 getImp1() {
        return new Imp_1();
    }
    
    interface Inside_2{
        
    }
    
    public class Imp_2 implements Inside_2{
        
    }

    public Inside_2 getInside_2() {
        return new Imp_2();
    }

    public Imp_2 getImp2() {
        return new Imp_2();
    }

    private interface Inside_3{
        
    }
    
    public class Imp_3 implements Inside_3{
        
    }

    public Inside_3 getInside_3() {
        return new Imp_3();
    }

    public Imp_3 getImp3() {
        return new Imp_3();
    }

}
