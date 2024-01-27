package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.programaUno.ProgramaUno;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        
        int respuesta = 0;
        Input entrada = new Input();
        ProgramaUno uno = new ProgramaUno();

        System.out.println("Lista de programas\n\n");         
        System.out.println("1.- Suma de dos números");

        System.out.println("\n\nIngrese la opcion seleccionada: ");
        respuesta = entrada.selecion(respuesta); 
        
        switch (respuesta) {
            case 1:
                
                uno.programaUno();
                System.out.println();
                break;
        }

    }
}