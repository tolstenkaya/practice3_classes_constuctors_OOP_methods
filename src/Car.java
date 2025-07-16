public class Car {
    String brand;
    String model;
    float fuel;
    boolean isRunning;

    Car(String brand, String model, float fuel, boolean isRunning){
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
        this.isRunning=isRunning;
    }

    void startEngine(){
        this.isRunning=true;
    }

    void drive(double km){

    }

    void refuel(double liters){

    }
}
