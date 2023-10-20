package oct14.Aggregation;

public class MainStudent {
    public static void main(String[] args) {

        FullName full = new FullName("Sahil", "Kumar", "Gaba");
        Student stud = new Student(full, 10);
        System.out.println(full);
        System.out.println(stud);


    }
}
