package src.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.java.Empleado;

public class TestEmpleado {
    @Test
    public void testEmpleado() {
        Empleado empleado = new Empleado("Juan", "Perez", 2500.0);

        assertEquals("Juan", empleado.getNombre());
        assertEquals("Perez", empleado.getApellido());
        assertEquals(2500.0, empleado.getSalarioMensual());
    }

    @Test
    public void testEmpleadoNegativos() {
        Empleado empleado = new Empleado("Ana", "Garcia", -3000.0);

        assertEquals(0.0, empleado.getSalarioMensual());
    }

    @Test
    public void testAumentoSalario() {
        Empleado empleado = new Empleado("Carlos", "Lopez", 4000.0);
        empleado.setSalarioMensual(empleado.getSalarioMensual() * 1.10);

        assertEquals(4400.0, empleado.getSalarioMensual());
    }

    @Test
    public void testContadorEmpleados() {
        Empleado empleado1 = new Empleado("Juan", "Perez", 2500.0);
        Empleado empleado2 = new Empleado("Ana", "Garcia", 3000.0);

        assertEquals(2, Empleado.getContadorEmpleados());
    }
}