package edu.upvictoria.fpoo.Utilidades.Geometria;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AreaCircunferenciaTest {
    @Test
    public void testRadioEntero() {

        double radio = 50;
        AreaCircunferencia obj = new AreaCircunferencia();

        assertEquals(7853.981634, obj.area(radio), 0.0001);

    }

    @Test
    public void testRadioDouble() {

        double radio = 2.6;
        AreaCircunferencia obj = new AreaCircunferencia();

        assertEquals(21.23716634, obj.area(radio), 0.0001);

    }

    @Test
    public void testRadioDoubleNegativo() {

        double radio = -2.6;
        AreaCircunferencia obj = new AreaCircunferencia();

        assertEquals(21.23716634, obj.area(radio), 0.0001);

    }

    @Test
    public void testRadioEnteroNegativo() {

        double radio = -50;
        AreaCircunferencia obj = new AreaCircunferencia();

        assertEquals(7853.981634, obj.area(radio), 0.0001);

    }

}
