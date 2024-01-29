package edu.upvictoria.fpoo.programaDiecisiete;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Geometria.TeoremaPitagoras;

/**
 * ProgramaDiecisiete
 */
public class ProgramaDiecisiete {

    public void programaDiecisiete() throws IOException{

        double a = 0, b = 0;

        InputNumbers entrada = new InputNumbers();
        TeoremaPitagoras calculo =  new TeoremaPitagoras();

        System.out.println("Ingresa la medida del primer cateto: ");
        a = Math.abs(entrada.pedir());
        
        System.out.println("Ingresa la medida del segundo cateto: ");
        b = Math.abs(entrada.pedir());

        System.out.println("Hipotenusa: " + calculo.dosCatetos(a, b));

    }

    
}