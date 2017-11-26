package eleven;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Exercise30 implements Collection<Pet> {

    private List<Pet> pets = new ArrayList<>();
    private static Pet[] petsArr = {new Pet(),new Pet(),new Pet(),new Pet(),new Pet(),new Pet(),new Pet()};
    {
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());
    }


    private static void display(Iterator<Pet> iterator) {
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.println(pet);
        }
    }

    @Test
    public void test1() {
        display(pets.iterator());
    }

    @Test
    public void test2() {
        Exercise30 exercise30 = new Exercise30();
        display(exercise30.iterator());
    }

    @Override
    public int size() {
        return pets.size();
    }

    @Override
    public boolean isEmpty() {
        return size() <= 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public  Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index<petsArr.length;
            }

            @Override
            public Pet next() {
                return petsArr[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Pet pet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}

class Pet {
    private static int index = 0;
    private int id = index++;

    public String toString() {
        return "Pet->" + this.id;
    }
}
