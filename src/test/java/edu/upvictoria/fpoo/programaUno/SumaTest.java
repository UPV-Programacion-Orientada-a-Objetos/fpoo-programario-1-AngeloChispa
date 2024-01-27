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

    @Test
    public void sumarNegativosEnteros(){
        double a = -34 , b = -84;

        Suma s = new Suma();

        assertEquals(-118, s.sumar(a, b), 0.000001); 
    }

    @Test
    public void sumaEnteroDouble(){
        double a = 23 , b = 567.234;

        Suma s = new Suma();

        assertEquals(590.234, s.sumar(a, b), 0.000001); 
    }

    @Test
    public void sumarEnteroDoubleNegativo(){
        double a = 57 , b = -14.234;

        Suma s = new Suma();

        assertEquals(42.766, s.sumar(a, b), 0.000001); 
    }

    @Test
    public void sumarPosistivosDouble(){
        double a = 25.8123 , b = 90.845;

        Suma s = new Suma();

        assertEquals(116.6573, s.sumar(a, b), 0.000001); 
    }

    @Test
    public void sumarNegativosDouble(){
        double a = -34.423 , b = -4523.45;

        Suma s = new Suma();

        assertEquals(-4557.873, s.sumar(a, b), 0.000001); 
    }

}
