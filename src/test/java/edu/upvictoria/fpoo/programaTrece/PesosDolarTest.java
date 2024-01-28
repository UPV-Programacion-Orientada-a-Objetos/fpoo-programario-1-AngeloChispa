package edu.upvictoria.fpoo.programaTrece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PesosDolarTest {
    
    @Test
    public void convertirEntero() {

        double a = 10000;

        PesosDolar obj = new PesosDolar();

        assertEquals(582.7505, obj.convertir(a), 0.0001);
        
    }

    @Test
    public void convertirDecimal() {

        double a = 100.45;

        PesosDolar obj = new PesosDolar();

        assertEquals(5.8537, obj.convertir(a), 0.0001);

    }

}
