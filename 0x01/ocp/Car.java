public class Car extends Vehicle implements IVehicleCar{


    public Car(String color, String year, double engine, int seats) {
        super(color, year, engine, seats);
        this.configureVehicle(color, year, engine, seats);

    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {

    }

    @Override
    public void startVehicle() {

    }
}
