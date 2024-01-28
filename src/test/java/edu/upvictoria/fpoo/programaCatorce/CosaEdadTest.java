package edu.upvictoria.fpoo.programaCatorce;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CosaEdadTest {
    
    /**
     * No puede recibir negativos
     */
    @Test
    public void testCalcular() {

        long a = 2000;

        CosaEdad obj = new CosaEdad();

        assertEquals(24, obj.calcular(a));

    }

    @Test
    public void calcularMayor() {

        long a = 2025;

        CosaEdad obj = new CosaEdad();

        assertEquals(0, obj.calcular(a));

    }
}
