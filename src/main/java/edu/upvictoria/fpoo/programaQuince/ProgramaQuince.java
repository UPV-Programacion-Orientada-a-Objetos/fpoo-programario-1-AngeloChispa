package edu.upvictoria.fpoo.programaQuince;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaQuince
 */
public class ProgramaQuince {

    public void programaCatorce() throws IOException{

        double precio = 0, horas = 0;
        InputNumbers entrada = new InputNumbers();
        

        System.out.println("Ingresa el precio por hora: ");
        precio = Math.abs(entrada.pedir());

        System.out.println("\nIngresa el número de horas: ");
        horas = Math.abs(entrada.pedir());

        if (horas%1 != 0){
            horas++;
        }

        System.out.println("Precio a pagar: "+ precio*horas);

    }


}