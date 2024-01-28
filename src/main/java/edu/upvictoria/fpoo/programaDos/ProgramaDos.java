package edu.upvictoria.fpoo.programaDos;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaDos
 */
public class ProgramaDos {

     public void programaDos() throws IOException{

        System.out.println("=================================");
        System.out.println("Programa 2: Promedio de un alumno");
        System.out.println("=================================");

        double a = 0, b = 0, c = 0, d = 0;

        InputNumbers entrada = new InputNumbers();
        FormatoNumeros truncar = new FormatoNumeros();
        BigDecimal obj;
        Promedio promedio = new Promedio();


        System.out.print("Ingrese la calificación del primer examen: ");
        a = entrada.pedir();
        a = truncar.formato(a);
        System.out.print("Ingrese la calificación del segundo examen: ");
        b = entrada.pedir();
        b=truncar.formato(b);
        System.out.print("Ingrese la calificación del tercer examen: ");
        c = entrada.pedir();
        c = truncar.formato(c);
        System.out.print("Ingrese la calificación del cuarto examen: ");
        d = entrada.pedir();
        d = truncar.formato(d);

        obj = new BigDecimal(promedio.promediar(a, b, c, d));
        obj = obj.setScale(1, RoundingMode.DOWN);

        System.out.println("Promedio: " + obj.doubleValue());

    }   

}