package edu.upvictoria.fpoo.programaDoce;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Geometria.AreaTriangulo;

/**
 * ProgramaDoce
 */
public class ProgramaDoce {

    public void programaDoce()throws IOException{

        double base = 0, altura = 0;

        InputNumbers entrada = new InputNumbers();
        AreaTriangulo resultado = new AreaTriangulo();

        System.out.println("Ingrese la base del triangulo: ");
        base = Math.abs(entrada.pedir());
        System.out.println("Ingrese la altura del triangulo: ");
        altura = Math.abs(entrada.pedir());

        System.out.println("El area del triangulo es: "+ resultado.area(altura, base));
        


    }


}