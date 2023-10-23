package all_assignments.OOPS.Assignment1.classes;

import all_assignments.OOPS.Assignment1.Interface.Animal;
import all_assignments.OOPS.Assignment1.Interface.Climbable;
import all_assignments.OOPS.Assignment1.Interface.Swimmable;

public class Monkey implements Animal, Climbable {

    public void feed(){
        System.out.println("Monkey: ");
        System.out.println("Monkey Eat Fruits, Leaves");
    }
    public void makesound(){
        System.out.println("Monkey sound like Hoot");
    }

    @Override
    public void climb() {
        System.out.println("Monkey is Climbing Tree...");
    }
}
