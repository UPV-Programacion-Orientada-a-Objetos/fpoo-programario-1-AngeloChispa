package edu.upvictoria.fpoo.programaDieciocho;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Multiplicacion;

/**
 * ProgramaDieciocho
 */
public class ProgramaDieciocho {

    public ProgramaDieciocho()throws IOException{

        double a = 0, b = 0;

        InputNumbers entrada = new InputNumbers();
        Multiplicacion resultado = new Multiplicacion();
        BigDecimal obj;

        System.out.println("Ingrese costo por kilometro: ");
        a = Math.abs(entrada.pedir());
        
        System.out.println("Ingresa la cantidad de kilometros recorridos: ");
        b = Math.abs(entrada.pedir());

        obj = new BigDecimal(resultado.multiplicar(a, b));
        obj = obj.setScale(2, RoundingMode.DOWN);

        System.out.println("Precio a pagar: " + obj.doubleValue());

    }


}