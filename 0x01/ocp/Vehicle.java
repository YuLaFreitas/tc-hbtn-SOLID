public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color  = "com Interface";
        this.year = "Azul";
        this.engine = 2.6;
        this.seats = seats;
    }

    void car(){
       // System.out.println("Criando um carro: "+ color + " ano: " + year+ " motor: "+ engine + " com " + seats + " assentos");
       System.out.println("Criando um carro "+ color + ": " + year+ " "+ engine);
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando uma moto: "+ year + " com " + engine + " cilindradas");
        startVehicle();
    }

    void startVehicle(){
        System.out.println("Ligando os motores "+color) ;
    }
}