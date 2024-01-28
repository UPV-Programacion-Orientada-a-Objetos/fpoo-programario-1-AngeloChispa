package edu.upvictoria.fpoo.programaOnce;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class prismaRectangularTest {
    
    /**
     * En principio no pueden entrar valores negativos
     */
    @Test
    public void testVolumen() {

        double largo = 3, ancho = 5, altura =2;

        prismaRectangular obj = new prismaRectangular();

        assertEquals(30, obj.volumen(largo, altura, ancho), 0.0001);

    }

    @Test
    public void testVolumenDecimales() {

        double largo = 3.2, ancho = 5.4, altura =2.7;

        prismaRectangular obj = new prismaRectangular();

        assertEquals(46.656, obj.volumen(largo, altura, ancho), 0.0001);

    }
}
