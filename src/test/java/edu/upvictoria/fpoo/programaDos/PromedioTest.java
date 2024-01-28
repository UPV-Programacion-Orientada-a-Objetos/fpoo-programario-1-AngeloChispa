package edu.upvictoria.fpoo.programaDos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PromedioTest {
    @Test
    public void entradaPositivos() {

        double a = 10, b = 5.4, c = 9.0, d = 3.4;
        Promedio obj = new Promedio();

        assertEquals(6.9, obj.promediar(a, b, c, d), d);

    }
}
