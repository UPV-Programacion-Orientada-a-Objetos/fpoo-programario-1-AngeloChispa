package edu.upvictoria.fpoo.programaUno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumaTest {
    @Test
    public void sumarPositivosEnteros() {

        double a = 67 , b = 23;

        Suma s = new Suma();

        assertEquals(90, s.sumar(a, b), 0.000001);        

    }
}
