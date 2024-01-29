package edu.upvictoria.fpoo.Utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {
    @Test
    public void testDividirEntero() {

        double a = 8, b = 2;

        Division obj = new Division();

        assertEquals(4, obj.dividir(a, b), 0.0001);

    }

    @Test
    public void testDividirEnteroNegativo() {

        double a = -8, b = -2;

        Division obj = new Division();

        assertEquals(4, obj.dividir(a, b), 0.0001);

    }

    @Test
    public void testDividirDouble() {

        double a = 10.56, b = 2.4;

        Division obj = new Division();

        assertEquals(4.4, obj.dividir(a, b), 0.0001);

    }

    @Test
    public void testDividirDoubleNegativo() {

        double a = -10.56, b = -2.4;

        Division obj = new Division();

        assertEquals(4.4, obj.dividir(a, b), 0.0001);

    }

}
