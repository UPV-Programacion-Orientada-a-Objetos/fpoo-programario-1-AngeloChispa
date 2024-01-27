package edu.upvictoria.fpoo.programaUno;

import java.io.IOException;

/**
 * ProgramaUno
 */
public class ProgramaUno {

    public void  programaUno() throws IOException {

        double numero = 0, numeroDos = 0;
        Suma s = new Suma();
        Input entrada = new Input();
        
        System.out.print("Ingrese un número: ");
        numero = entrada.pedir ();

        System.out.print("Ingrese otro numero: ");
        numeroDos = entrada.pedir();

        if(s.sumar(numero, numeroDos)%1 == 0){
            System.out.println("Resultado: " + (int) s.sumar(numero, numeroDos));
        }else{
            System.out.println("Resultado: " + s.sumar(numero, numeroDos));
        }        

    }
}