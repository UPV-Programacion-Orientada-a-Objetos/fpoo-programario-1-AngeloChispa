package edu.upvictoria.fpoo.programaDos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormatoNumerosTest {
    @Test
    public void testNumeroPositivo(){

        double a = 8.87;
        FormatoNumeros obj = new FormatoNumeros();

        assertEquals(8.87, obj.formato(a), 0.1);

    }

    @Test
    public void testNumeroNegativos(){

        double a = -8.87;
        FormatoNumeros obj = new FormatoNumeros();

        assertEquals(8.87, obj.formato(a), 0.1);

    }

    @Test
    public void testMayorDiez(){

        double a = 95;
        FormatoNumeros obj = new FormatoNumeros();

        assertEquals(9.5, obj.formato(a), 0.1);

    }

    @Test
    public void testDiezDecimal(){

        double a = 10.5;
        FormatoNumeros obj = new FormatoNumeros();

        assertEquals(10, obj.formato(a), 0.1);

    }
}
