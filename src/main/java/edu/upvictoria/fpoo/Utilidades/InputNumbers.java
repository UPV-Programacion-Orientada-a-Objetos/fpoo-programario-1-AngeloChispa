package edu.upvictoria.fpoo.Utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 */
public class InputNumbers{

    public double pedir() throws IOException{

        boolean bandera = true;
        double a = 0;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        while (bandera) {
            try{
                bandera = false;
                a = Double.parseDouble(leer.readLine());
            }catch(NumberFormatException e){
                bandera = true;
                System.out.println("=======================");
                System.out.println("Solo se aceptan números");
                System.out.println("=======================");
                System.out.println("Ingrese un número valido: ");
            }   
        }
        return a;   
    }
}