package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.Direccion;
import src.main.java.Propietario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPropietario {
    @Test
    public void testPropietario() {
        Direccion direccion = new Direccion("Calle 123", "Centro", "Ciudad");
        Propietario propietario = new Propietario("Juan Perez", "01/01/1980", direccion);
z
        assertEquals("Juan Perez", propietario.getNombre());
        assertEquals("01/01/1980", propietario.getFechaNacimiento());
        assertEquals(direccion, propietario.getDireccion());
    }
}