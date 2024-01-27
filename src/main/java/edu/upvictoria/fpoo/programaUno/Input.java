package edu.upvictoria.fpoo.programaUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 */
public class Input {

    public double pedir() throws IOException{

        boolean bandera = true;
        double a = 0;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        while(bandera){
            try{
                bandera = false;
                a = Double.parseDouble(leer.readLine());
            }catch(NumberFormatException e){
                bandera = true;
                System.out.println("Solo se aceptan valores númericos.");
                System.out.println("Porfavor ingrese otro número: ");
            }
        }
        return a;   
    }
}