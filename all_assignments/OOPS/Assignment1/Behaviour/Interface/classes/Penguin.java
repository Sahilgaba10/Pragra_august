package all_assignments.OOPS.Assignment1.Behaviour.Interface.classes;

import all_assignments.OOPS.Assignment1.Behaviour.Interface.Swimmable;

public class Penguin implements Swimmable.Animal, Swimmable {

    public void feed(){
        System.out.println("Penguin: ");
        System.out.println("Penguin Eat Fish");
    }
    public void makesound(){
        System.out.println("Penguin sound like Honking");
    }

    @Override
    public void swim() {
        System.out.println("Penguins can swim");
    }
}
