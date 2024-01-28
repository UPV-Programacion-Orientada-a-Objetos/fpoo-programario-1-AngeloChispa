package edu.upvictoria.fpoo.programaDiez;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class convertirMetrosPulgadasTest {

    /**
     * En principio a este metodo no le pueden entrar valores negativos
     */
    @Test
    public void metrosEnteros() {

        double metros = 3;
        convertirMetrosPulgadas obj = new convertirMetrosPulgadas();

        assertEquals(118.1102, obj.pulgadas(metros), 0.0001);

    }

    @Test
    public void metrosDecimales() {

        double metros = 1.567;
        convertirMetrosPulgadas obj = new convertirMetrosPulgadas();

        assertEquals(61.6929, obj.pulgadas(metros), 0.0001);

    }
}
