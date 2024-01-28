package edu.upvictoria.fpoo.programaTres;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PropiedadesRectanguloTest {
    @Test
    public void testMedidasIguales() {

        double a = 2.3, b = 2.3;
        PropiedadesRectangulo obj = new PropiedadesRectangulo();

        assertTrue(obj.medidas(a, b));        

    }

    @Test
    public void testMedidasDiferentes() {

        double a = 2.3, b = 3;
        PropiedadesRectangulo obj = new PropiedadesRectangulo();

        assertFalse(obj.medidas(a, b));        

    }
}
