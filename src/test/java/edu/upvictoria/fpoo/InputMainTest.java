package edu.upvictoria.fpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InputMainTest {
    @Test
    public void entero() {

        InputMain obj = new InputMain();
        System.setIn(new java.io.ByteArrayInputStream("2\n".getBytes()));
        
        assertEquals(2, obj.selecion());

    }

    @Test
    public void enteroNegativo() {

        InputMain obj = new InputMain();
        System.setIn(new java.io.ByteArrayInputStream("-4\n".getBytes()));
        
        assertEquals(4, obj.selecion());

    }

    @Test
    public void entradaDouble() {

        InputMain obj = new InputMain();
        System.setIn(new java.io.ByteArrayInputStream("4.53\n".getBytes()));
        
        assertEquals(4, obj.selecion());

    }

    @Test
    public void entradaDoubleNegativo() {

        InputMain obj = new InputMain();
        System.setIn(new java.io.ByteArrayInputStream("-7.345\n".getBytes()));
        
        assertEquals(7, obj.selecion());

    }
}
