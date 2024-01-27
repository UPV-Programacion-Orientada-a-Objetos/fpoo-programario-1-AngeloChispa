package edu.upvictoria.fpoo.programaUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ProgramaUno
 */
public class ProgramaUno {

    public static void main(String[] args) throws IOException {

        double numero = 0, numeroDos = 0;
        Suma s = new Suma();

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese un número: ");
        numero = Double.parseDouble(leer.readLine());

        System.out.print("Ingrese otro numero: ");
        numeroDos = Double.parseDouble(leer.readLine());

        if(s.sumar(numero, numeroDos)%1 == 0){
            System.out.println("Resultado: " + (int) s.sumar(numero, numeroDos));
        }else{
            System.out.println("Resultado: " + s.sumar(numero, numeroDos));
        }        

    }
}