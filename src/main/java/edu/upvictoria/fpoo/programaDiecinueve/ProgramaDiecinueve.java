package edu.upvictoria.fpoo.programaDiecinueve;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.Division;
import edu.upvictoria.fpoo.Utilidades.InputNumbers;


/**
 * ProgramaDiecinueve
 */
public class ProgramaDiecinueve {

    public ProgramaDiecinueve() throws IOException{

        double a = 0, b = 0;

        InputNumbers entrada = new InputNumbers();
        Division resultado = new Division();

        System.out.println("Ingresa la distancia en kilometros: ");
        a = Math.abs(entrada.pedir());
        
        System.out.println("Ingresa la velocidad en Km/h: ");
        b = Math.abs(entrada.pedir());

        if (resultado.dividir(a, b)%1 == 0){
            System.out.println("El tiempo que tardara sera de: " + (long)resultado.dividir(a, b));
        }else{
            System.out.println("El tiempo que tardara sera de: " + resultado.dividir(a, b));
        }

    }


}