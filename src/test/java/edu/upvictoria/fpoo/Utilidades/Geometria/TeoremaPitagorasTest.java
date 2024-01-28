package edu.upvictoria.fpoo.Utilidades.Geometria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeoremaPitagorasTest {
    
    /**
     * En principio a este metodo no le pueden entrar valores negativos
     */

    @Test
    public void testEnteros() {

        double cateto = 5, hipotenusa = 13;

        TeoremaPitagoras obj = new TeoremaPitagoras();

        assertEquals(12, obj.CatetoHipotenusa(cateto, hipotenusa), 0.0001);

    }

    @Test
    public void testDecimales() {

        double cateto = 5.4, hipotenusa = 10.3;

        TeoremaPitagoras obj = new TeoremaPitagoras();

        assertEquals(8.7709, obj.CatetoHipotenusa(cateto, hipotenusa), 0.0001);

    }

    @Test
    public void testDecimalesNegativos() {

        double cateto = -5.4, hipotenusa = -10.3;

        TeoremaPitagoras obj = new TeoremaPitagoras();

        assertEquals(8.7709, obj.CatetoHipotenusa(cateto, hipotenusa), 0.0001);

    }

    @Test
    public void testEnterosNegativos() {

        double cateto = -5, hipotenusa = -13;

        TeoremaPitagoras obj = new TeoremaPitagoras();

        assertEquals(12, obj.CatetoHipotenusa(cateto, hipotenusa), 0.0001);

    }
    
}
