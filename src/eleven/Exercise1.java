package eleven;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<>();
        for(int i =0;i<10;i++) {
            list.add(new Gerbil());
        }
        for (Gerbil gerbil : list) {
            gerbil.hop();
        }
    }
}

class Gerbil {
    public static int i ;
    public int id = i++;
    public void hop() {
        System.out.println("Gerbil-"+id);
    }

    @Override
    public String toString() {
        return "Gerbil{" +
                "id=" + id +
                '}';
    }
}