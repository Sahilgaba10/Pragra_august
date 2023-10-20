package oct17.vehicleAbstract;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.print();
        car.speed();

        Vehicle motorbike = new MotorBike();
        motorbike.print();
        motorbike.speed();

        Vehicle cycle = new Cycle();
        cycle.print();
        cycle.speed();
    }
}
