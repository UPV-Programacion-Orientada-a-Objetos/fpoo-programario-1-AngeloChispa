package edu.upvictoria.fpoo.programaSiete;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertirLitrosTest {
    @Test
    public void testGalones() {

        double a = 11.355;
        ConvertirLitros obj = new ConvertirLitros();

        assertEquals(3.0, obj.galones(a), 0.0001);

    }
}
