package all_assignments.OOPS.Assignment1;

import all_assignments.OOPS.Assignment1.classes.Lion;
import all_assignments.OOPS.Assignment1.classes.Monkey;
import all_assignments.OOPS.Assignment1.classes.Penguin;

public class MainAnimal {
    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.feed();
        lion.makesound();
        lion.roar();

        Penguin penguin = new Penguin();
        penguin.feed();
        penguin.makesound();
        penguin.swim();

        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makesound();
        monkey.climb();


    }
}
