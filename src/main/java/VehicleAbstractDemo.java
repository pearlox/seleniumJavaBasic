abstract public class VehicleAbstractDemo {

    abstract public void displayWheels();

}

class Car extends VehicleAbstractDemo {

    public void displayWheels() {

    }
}

class AutoRickshaw extends VehicleAbstractDemo {

    @Override
    public void displayWheels() {

    }
}

class DisplayAllVehicles {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayWheels();
    }
}
