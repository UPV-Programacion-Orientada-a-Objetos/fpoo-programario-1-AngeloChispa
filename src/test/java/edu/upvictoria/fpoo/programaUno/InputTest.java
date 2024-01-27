package edu.upvictoria.fpoo.programaUno;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class InputTest {
    @Test
    public void pedirEntero() throws IOException{

        Input obj = new Input();
        System.setIn(new java.io.ByteArrayInputStream("2\n".getBytes()));

        assertEquals(2, obj.pedir(), 0.00001);

    }

    @Test
    public void pedirEnteroNegativo() throws IOException{

        Input obj = new Input();
        System.setIn(new java.io.ByteArrayInputStream("-3\n".getBytes()));

        assertEquals(-3, obj.pedir(), 0.00001);

    }

    @Test
    public void pedirDouble() throws IOException{

        System.setIn(new java.io.ByteArrayInputStream("4.1345\n".getBytes()));
        Input obj = new Input();

        assertEquals(4.1345, obj.pedir(), 0.00001);

    }

    @Test
    public void pedirDoubleNegativo() throws IOException{

        System.setIn(new java.io.ByteArrayInputStream("-4.1345\n".getBytes()));
        Input obj = new Input();

        assertEquals(-4.1345, obj.pedir(), 0.00001);

    }

}
