package edu.upvictoria.fpoo.Utilidades;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RangoNumerosTest {
    @Test
    public void testInRange() {

        RangoNumeros obj = new RangoNumeros();

        assertFalse(obj.validos(4, 0, 10));

    }

    @Test
    public void tesOutRange() {

        RangoNumeros obj = new RangoNumeros();

        assertTrue(obj.validos(-2, 0, 10));

    }
}
