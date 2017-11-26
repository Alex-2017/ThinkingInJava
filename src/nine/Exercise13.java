package nine;

/**
 * Created by 10170 on 2017/10/11.
 */
public class Exercise13 {
}
interface BaseInterface{
    void base();
}

interface Derived_1 extends BaseInterface{
    void derived_1();
}

interface Derived_2 extends BaseInterface{
    void derived_2();
}

interface CombineInterface extends Derived_1,Derived_2{
    void combine();
}

class Diamond implements CombineInterface{

    @Override
    public void base() {

    }

    @Override
    public void derived_1() {

    }

    @Override
    public void derived_2() {

    }

    @Override
    public void combine() {

    }
}