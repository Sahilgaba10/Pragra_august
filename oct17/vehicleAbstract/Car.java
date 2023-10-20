package oct17.vehicleAbstract;

import oct17.vehicleAbstract.Vehicle;

public class Car extends Vehicle {
    @Override
    public void speed() {
        System.out.println("Car runing at 120km/hr");
    }
}
