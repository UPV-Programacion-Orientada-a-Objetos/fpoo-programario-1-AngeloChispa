package edu.upvictoria.fpoo.programaUno;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaUno
 */
public class ProgramaUno {

    public void  programaUno() throws IOException {
        System.out.println("\n===============================");
        System.out.println("Programa 1: Suma de dos números");
        System.out.println("===============================\n");

        double numero = 0, numeroDos = 0;
        Suma s = new Suma();
        InputNumbers entrada = new InputNumbers();
        
        System.out.print("Ingrese un número: ");
        numero = entrada.pedir ();

        System.out.print("Ingrese otro numero: ");
        numeroDos = entrada.pedir();

        if(s.sumar(numero, numeroDos)%1 == 0){
            System.out.println("Resultado: " + (long) s.sumar(numero, numeroDos));
        }else{
            System.out.println("Resultado: " + s.sumar(numero, numeroDos));
        }        

    }
}