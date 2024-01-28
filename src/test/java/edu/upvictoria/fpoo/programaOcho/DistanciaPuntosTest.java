package edu.upvictoria.fpoo.programaOcho;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistanciaPuntosTest {
    @Test
    public void testDistanciaMixtos() {

        double[] a = {5.6,3,-12.3,7};
        DistanciaPuntos obj = new DistanciaPuntos();

        assertEquals(18.34148, obj.distancia(a[0], a[1], a[2], a[3]), 0.001);

    }

    @Test
    public void testDistanciaEnteros() {

        double[] a = {8,3,4,7};
        DistanciaPuntos obj = new DistanciaPuntos();

        assertEquals(5.65685, obj.distancia(a[0], a[1], a[2], a[3]), 0.001);

    }

    @Test
    public void testDistanciaDecimales() {

        double[] a = {5.6,3.1,12.3,6.4};
        DistanciaPuntos obj = new DistanciaPuntos();

        assertEquals(7.46860, obj.distancia(a[0], a[1], a[2], a[3]), 0.0001);

    }

    @Test
    public void testDistanciaEnterosNegativos() {

        double[] a = {-8,-2,-4,-7};
        DistanciaPuntos obj = new DistanciaPuntos();

        assertEquals(6.40312, obj.distancia(a[0], a[1], a[2], a[3]), 0.001);

    }

    @Test
    public void testDistanciaDecimalesNegativos() {

        double[] a = {-5.6,-3.1,-2.5,-6.4};
        DistanciaPuntos obj = new DistanciaPuntos();

        assertEquals(4.52769, obj.distancia(a[0], a[1], a[2], a[3]), 0.0001);

    }

}
