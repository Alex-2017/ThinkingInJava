package nine;

/**
 * Created by 10170 on 2017/10/11.
 */
public class Exercise12 {

    public static void canSwim(canSwim swim) {
        swim.swim();
    }
    public static void canClimb(canClimb climb) {
        climb.climb();
    }
    public static void canFight(canFight fight) {
        fight.fight();
    }
    public static void canFly(canFly fly) {
        fly.fly();
    }

    public static void charFight(ActionCharacter character) {
        character.fight();
    }

    public static void main(String[] args){
        Hero hero = new Hero();
        canSwim(hero);
        canClimb(hero);
        canFight(hero);
        canFly(hero);
        charFight(hero);
    }
}
class ActionCharacter{
    public void fight() {

    }
}

interface canFight{
    void fight();
}

interface canSwim{
    void swim();
}

interface canFly{
    void fly();
}

interface canClimb{
    void climb();
}

class Hero extends ActionCharacter implements canFight, canSwim, canFly, canClimb {

    @Override
    public void fight() {
        System.out.println("Common Fight");
    }

    @Override
    public void swim() {
        System.out.println("Can Swim");
    }

    @Override
    public void fly() {
        System.out.println("Can Fly");
    }

    @Override
    public void climb() {
        System.out.println("Can Climb");
    }
}