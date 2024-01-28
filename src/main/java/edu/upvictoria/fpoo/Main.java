package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.programaDos.ProgramaDos;
import edu.upvictoria.fpoo.programaUno.ProgramaUno;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        
        int respuesta = 0;
        InputMain entrada = new InputMain();
        ProgramaUno uno = new ProgramaUno();
        ProgramaDos dos = new ProgramaDos();

        System.out.println("Lista de programas\n\n");         
        System.out.println("1.- Suma de dos números");
        System.out.println("2.- Promedio de exámenes");

        System.out.println("\n\nIngrese la opcion seleccionada: ");
        respuesta = entrada.selecion(); 
        
        switch (respuesta) {
            case 1:
                
                uno.programaUno();
                System.out.println();
                break;
            case 2:
                dos.programaDos();
                System.out.println();
                break;

        }

    }
}