public class Car extends Vehicle implements IVehicleCar{


    public Car(String color, String year, double engine) {
        super(color, year, engine, 0);
        this.configureVehicle(color, year, engine,0);

    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {

    }

    @Override
    public void startVehicle() {

    }
}
