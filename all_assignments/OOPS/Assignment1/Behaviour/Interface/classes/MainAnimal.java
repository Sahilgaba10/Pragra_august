package all_assignments.OOPS.Assignment1.Behaviour.Interface.classes;

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
