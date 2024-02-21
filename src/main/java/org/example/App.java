package org.example;

public class App {
    public int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float kelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15);
    }

    public static void main( String[] args ){
        int fahrenheit2celcius = new App().toCelsius(32);
        System.out.println("32 Fahrenheit is " + fahrenheit2celcius + " Celsius");

        float kelvin2celcius = App.kelvinToCelsius(273.15f);
        System.out.println("273.15 Kelvin is " + kelvin2celcius + " Celsius");
    }
}
