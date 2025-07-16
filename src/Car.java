public class Car {
    String brand;
    String model;
    double fuel;
    boolean isRunning;

    Car(String brand, String model, double fuel, boolean isRunning){
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
        this.isRunning=isRunning;
    }

    void startEngine(){
        this.isRunning=true;
        System.out.println("The car is started");
    }

    void drive(double km){
        double liters_spent = km*0.08;

        double max_distance = fuel*100/8;

        if(liters_spent>fuel){
            System.out.println("There is only enough fuel for "+max_distance+". You need to fill with fuel");
        }else{
            fuel-=liters_spent;
            System.out.println("Traveled: "+km+" km. Remaining fuel: "+fuel+" l");
        }
    }

    void refuel(double liters){
        fuel+=liters;
        System.out.println("Remaining fuel: "+fuel+" l");
    }
}
