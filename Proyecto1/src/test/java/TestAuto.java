package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.Auto;
import src.main.java.Direccion;
import src.main.java.Marca;
import src.main.java.Propietario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAuto {
    @Test
    public void testAuto() {
        Direccion direccion = new Direccion("Calle 123", "Centro", "Ciudad");
        Propietario propietario = new Propietario("Juan Perez", "01/01/1980", direccion);
        Marca marca = new Marca("Toyota", 10, 1937, "TYT123");

        Auto auto = new Auto("Corolla", "Rojo", 2020, marca, "ABC123", propietario, 180, 4, true, 6, true);

        assertEquals("Corolla", auto.getModelo());
        assertEquals("Rojo", auto.getColor());
        assertEquals(2020, auto.getAño());
        assertEquals(marca, auto.getMarca());
        assertEquals("ABC123", auto.getChasis());
        assertEquals(propietario, auto.getPropietario());
        assertEquals(180, auto.getVelocidadMaxima());
        assertEquals(0, auto.getVelocidadActual());
        assertEquals(4, auto.getNumeroPuertas());
        assertTrue(auto.isTieneTechoSolar());
        assertEquals(6, auto.getNumeroMarchas());
        assertTrue(auto.isTieneTransmisionAutomatica());

        auto.acelerar();
        assertEquals(1, auto.getVelocidadActual());

        auto.frenar();
        assertEquals(0, auto.getVelocidadActual());
    }
}