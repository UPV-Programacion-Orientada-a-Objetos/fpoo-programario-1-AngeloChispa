package edu.upvictoria.fpoo.programaCatorce;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaCatorce
 */
public class ProgramaCatorce {

    public void programaCatorce()throws IOException{

        long year = 0; 
        
        InputNumbers entrada = new InputNumbers();
        CosaEdad obj = new CosaEdad();


        System.out.println("Ingresa tu año de nacimiento: ");
        year = (long) Math.abs(entrada.pedir());

        System.out.println("Edad: "+ obj.calcular(year));

    }



}