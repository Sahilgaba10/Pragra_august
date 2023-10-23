package all_assignments.OOPS.Assignment1.classes;

import all_assignments.OOPS.Assignment1.Interface.Animal;
import all_assignments.OOPS.Assignment1.Interface.Roar;
import all_assignments.OOPS.Assignment1.Interface.Swimmable;

public class Lion implements Animal, Roar {


    @Override
    public void feed() {
        System.out.println("Lion: ");
        System.out.println("Lion Eat Large Animals");
    }
    @Override
    public void makesound() {
        System.out.println("Lion may Growl");
    }

    @Override
    public void roar() {
        System.out.println("Lion is Roaring");
    }
}
