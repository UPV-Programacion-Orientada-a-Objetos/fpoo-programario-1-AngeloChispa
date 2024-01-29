package edu.upvictoria.fpoo.programaVeinticuatro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AhorrarTest {
    @Test
    public void testAhorroEntero() {

        double a = 200;
        Ahorrar obj = new Ahorrar();

        assertEquals(1440, obj.ahorro(a), 0.0001);

    }
}
