package edu.upvictoria.fpoo.programaDieciseis;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaDieciseis
 */
public class ProgramaDieciseis {

    public void programaDieciseis() throws IOException{

        double precio = 0, metrosCuadrados = 0;

        InputNumbers entrada = new InputNumbers();

        System.out.println("Ingrese el precio por metro cuadrado: ");
        precio = Math.abs(entrada.pedir());

        System.out.println("Ingresa los metros cuadrados del cuadro a pintar: ");
        metrosCuadrados = Math.abs(entrada.pedir());

        System.out.println("Resultado: " + precio*metrosCuadrados);

    }
    

}