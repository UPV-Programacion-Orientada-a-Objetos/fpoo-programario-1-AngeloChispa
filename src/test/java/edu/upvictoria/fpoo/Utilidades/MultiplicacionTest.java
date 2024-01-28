package edu.upvictoria.fpoo.Utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicacionTest {
    @Test
    public void testMultiplicarEnteros() {

        double a = 23, b = 50;
        Multiplicacion obj = new Multiplicacion();

        assertEquals(1150.0, obj.multiplicar(a, b), 0.0001);

    }

    @Test
    public void testMultiplicarDoubles() {

        double a = 2.678, b = 50.45;
        Multiplicacion obj = new Multiplicacion();

        assertEquals(135.1051, obj.multiplicar(a, b), 0.0001);

    }

    @Test
    public void testMultiplicarEnterosNegativos() {

        double a = -2, b = -50;
        Multiplicacion obj = new Multiplicacion();

        assertEquals(100, obj.multiplicar(a, b), 0.0001);

    }

    @Test
    public void testMultiplicarDoublesNegativos() {

        double a = -3.56, b = -23.78;
        Multiplicacion obj = new Multiplicacion();

        assertEquals(84.6568, obj.multiplicar(a, b), 0.0001);

    }

    @Test
    public void testMultiplicarDoublesMixtos() {

        double a = -3.56, b = 23.78;
        Multiplicacion obj = new Multiplicacion();

        assertEquals(-84.6568, obj.multiplicar(a, b), 0.0001);

    }

    @Test
    public void testMultiplicarEnterosMixtos() {

        double a = 2, b = -50;
        Multiplicacion obj = new Multiplicacion();

        assertEquals(-100, obj.multiplicar(a, b), 0.0001);

    }


}
