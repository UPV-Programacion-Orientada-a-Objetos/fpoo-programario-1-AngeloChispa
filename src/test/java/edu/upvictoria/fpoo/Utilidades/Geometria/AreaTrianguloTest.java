package edu.upvictoria.fpoo.Utilidades.Geometria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AreaTrianguloTest {
    
    /**
     * En teoria no puede recibir negativos
     */
    @Test
    public void areaEntera() {

        double base = 5, altura = 6;

        AreaTriangulo obj = new AreaTriangulo();

        assertEquals(15, obj.area(altura, base), 0.0001);

    }

    @Test
    public void areaDecimal() {

        double base = 5.5, altura = 6.34;

        AreaTriangulo obj = new AreaTriangulo();

        assertEquals(17.435, obj.area(altura, base), 0.0001);

    }

}
