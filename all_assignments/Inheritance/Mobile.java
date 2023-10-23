package all_assignments.Inheritance;

public class Mobile {
    String brand;
    int capacity;

    Mobile(String brand, int capacity){
        this.brand= brand;
        this.capacity= capacity;
    }
    public void mob(){
        System.out.println("Brand :" +brand);
        System.out.println("Capacity :" +capacity);

    }
}
