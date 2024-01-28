package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 */
public class InputMain{

    public int selecion(){

        double a = 0; 
        boolean bandera = true;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {
            try{
                bandera = false;
                a = Double.parseDouble(leer.readLine());
            }catch( IOException | NumberFormatException e){
                bandera = true;
                System.out.println("Opción invalida");
                System.out.println("Solo se aceptan los números de la lista");
                System.out.print("Favor de ingresar un número valido: ");
            }
        }

        return Math.abs((int) a);
    }
}