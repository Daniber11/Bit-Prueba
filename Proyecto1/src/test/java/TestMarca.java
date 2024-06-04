package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.Marca;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMarca {
    @Test
    public void testMarca() {
        Marca marca = new Marca("Toyota", 10, 1937, "TYT123");

        assertEquals("Toyota", marca.getNombre());
        assertEquals(10, marca.getNrDeModelos());
        assertEquals(1937, marca.getAñoDeLanzamiento());
        assertEquals("TYT123", marca.getCodigoIdentificador());
    }
}