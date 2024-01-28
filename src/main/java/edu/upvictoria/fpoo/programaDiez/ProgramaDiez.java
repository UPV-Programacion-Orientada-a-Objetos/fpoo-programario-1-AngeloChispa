package edu.upvictoria.fpoo.programaDiez;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaDiez
 */
public class ProgramaDiez {

    public void programaDiez() throws IOException{

        double metros = 0;

        InputNumbers entrada = new InputNumbers();
        convertirMetrosPulgadas resultado = new convertirMetrosPulgadas();

        System.out.print("Ingrese la cantidad en metros: ");
        metros = Math.abs(entrada.pedir());

        System.out.println("Valor en pulgadas: " + resultado.pulgadas(metros));

    }    

}