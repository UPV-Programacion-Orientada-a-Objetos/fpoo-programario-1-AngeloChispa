package edu.upvictoria.fpoo.programaNueve;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Multiplicacion;

/**
 * ProgramaNueve
 */
public class ProgramaNueve {
    
    public void programaNueve() throws IOException{

        double paga = 0;
        int horas = 0;
        boolean bandera = true;

        InputNumbers entrada = new InputNumbers();
        Multiplicacion resultado = new Multiplicacion();

        while(bandera){
            bandera = false;
            System.out.println("Ingrese el sueldo por hora: ");
            horas = (int) Math.abs(entrada.pedir());

            if(horas>168){
                bandera = true;
                System.out.println("No se pueden realizar más de 168 horas en una semana");
            }
        }

        System.out.println("Ingrese las horas trabajdas: ");
        paga = Math.abs(entrada.pedir());

        System.out.println("El pago de esta semana es: $" + resultado.multiplicar(paga, (double) horas));



    }
}