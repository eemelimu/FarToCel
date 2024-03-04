package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest  {

    private static App app;

    @BeforeAll
    public static void setUp() {
        app = new App();
    }

    @Test
    void toCelsius() {
        int result = app.toCelsius(32);
        assertEquals(0, result);
    }

    @Test
    void kelvinToCelsius() {
        float result = App.kelvinToCelsius(273.15F);
        assertEquals(0, result, 0.001);
    }

    @Test
    void KelToFar() {
        float result = App.KelToFar(273.15F);
        assertEquals(32, result, 0.001);
    }
}
