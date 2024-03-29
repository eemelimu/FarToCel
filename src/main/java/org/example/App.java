package org.example;

public class App {
    public int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float kelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15);
    }

    public static float KelToFar(float kelvin) {
        return (float) ((kelvin -273.15) * 9/5 + 32);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.toCelsius(32));
        System.out.println(App.kelvinToCelsius(273.15F));
        System.out.println(App.KelToFar(273.15F));
    }
}
