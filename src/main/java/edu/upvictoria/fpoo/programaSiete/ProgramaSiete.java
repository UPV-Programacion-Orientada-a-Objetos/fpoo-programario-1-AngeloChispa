package edu.upvictoria.fpoo.programaSiete;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaSiete
 */
public class ProgramaSiete {

    public void programaSeis() throws IOException{

        double litros = 0;

        InputNumbers entrada  = new InputNumbers();
        ConvertirLitros resultado = new ConvertirLitros();

        System.out.println("Ingrese la cantidad de leche en litros: ");
        litros = Math.abs(entrada.pedir());
    
        System.out.println("La cantidad en galones es: " + resultado.galones(litros));    

    }


}