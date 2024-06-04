package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.Direccion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDireccion {
    @Test
    public void testDireccion() {
        Direccion direccion = new Direccion("Calle 123", "Centro", "Ciudad");

        assertEquals("Calle 123", direccion.getCalle());
        assertEquals("Centro", direccion.getBarrio());
        assertEquals("Ciudad", direccion.getCiudad());
    }
}
