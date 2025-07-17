public class TemperatureConverter {
    public double celsiusToFahrenheit(double c){
        return 9.0/5*c+32;
    }

    public double celsiusToKelvin(double c){
        return c+273.15;
    }

    public double fahrenheitToCelsius(double f){
        return 5.0/9*(f-32);
    }

    public double kelvinToCelsius(double k){
        return k-273.15;
    }
}
