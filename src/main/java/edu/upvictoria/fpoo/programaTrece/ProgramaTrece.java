package edu.upvictoria.fpoo.programaTrece;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaTrece
 */
public class ProgramaTrece {

    public void programaTrece() throws IOException{

        double pesos = 0;

        InputNumbers entrada = new InputNumbers();
        PesosDolar resultado = new PesosDolar();

        System.out.println("===================");
        System.out.println("El dolar vale 17.16");
        System.out.println("===================\n");

        System.out.println("Ingrese la cantidad de dinero en pesos: ");
        pesos = Math.abs(entrada.pedir());

        System.out.println("Los dolares que se pueden adquirir son: "+ resultado.convertir(pesos));

    }


}