package edu.upvictoria.fpoo.programaVeinticuatro;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaVeinticuatro
 */
public class ProgramaVeinticuatro {

    public ProgramaVeinticuatro()throws IOException{

        double a = 0;

        InputNumbers entrada = new InputNumbers();
        Ahorrar resultado = new Ahorrar();

        System.out.println("Ingrese su sueldo: ");
        a = Math.abs(entrada.pedir());

        System.out.println("El total ahorrado en un año es de: $" + resultado.ahorro(a));

    }


}