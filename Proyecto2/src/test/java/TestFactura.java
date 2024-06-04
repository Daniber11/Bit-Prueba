package src.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.java.Factura;

public class TestFactura {
    @Test
    public void testFactura() {
        Factura factura = new Factura("001", "Monitor", 2, 150.0);

        assertEquals("001", factura.getNumero());
        assertEquals("Monitor", factura.getDescripcion());
        assertEquals(2, factura.getCantidadComprada());
        assertEquals(150.0, factura.getPrecioPorArticulo());
        assertEquals(300.0, factura.getTotalFactura());
    }

    @Test
    public void testFacturaNegativos() {
        Factura factura = new Factura("002", "Teclado", -1, -50.0);

        assertEquals(0, factura.getCantidadComprada());
        assertEquals(0.0, factura.getPrecioPorArticulo());
        assertEquals(0.0, factura.getTotalFactura());
    }
}
