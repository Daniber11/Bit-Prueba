package src.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.java.IntegerSet;

public class TestIntegerSet {
    @Test
    public void testInsertarElemento() {
        IntegerSet set = new IntegerSet();
        set.insertarElemento(5);
        set.insertarElemento(10);

        assertTrue(set.toSetString().contains("5"));
        assertTrue(set.toSetString().contains("10"));
    }

    @Test
    public void testEliminarElemento() {
        IntegerSet set = new IntegerSet();
        set.insertarElemento(5);
        set.eliminarElemento(5);

        assertFalse(set.toSetString().contains("5"));
    }

    @Test
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertarElemento(5);
        set2.insertarElemento(10);

        IntegerSet unionSet = IntegerSet.union(set1, set2);

        assertTrue(unionSet.toSetString().contains("5"));
        assertTrue(unionSet.toSetString().contains("10"));
    }

    @Test
    public void testInterseccion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertarElemento(10);
        set2.insertarElemento(10);

        IntegerSet interseccionSet = IntegerSet.interseccion(set1, set2);

        assertTrue(interseccionSet.toSetString().contains("10"));
    }

    @Test
    public void testEqualTo() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertarElemento(10);
        set2.insertarElemento(10);

        assertTrue(set1.equalTo(set2));
    }

    @Test
    public void testToSetString() {
        IntegerSet set = new IntegerSet();
        set.insertarElemento(5);
        set.insertarElemento(10);

        assertEquals("5 10", set.toSetString());
    }
}
