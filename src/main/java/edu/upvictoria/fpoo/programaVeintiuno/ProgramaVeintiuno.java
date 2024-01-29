package edu.upvictoria.fpoo.programaVeintiuno;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Multiplicacion;

/**
 * ProgramaVeintiuno
 */
public class ProgramaVeintiuno {

    public ProgramaVeintiuno() throws IOException{

         double a = 0, b = 0;

        InputNumbers entrada = new InputNumbers();
        Multiplicacion resultado = new Multiplicacion();
        BigDecimal obj;

        System.out.println("Ingrese costo del metro cubico de agua: ");
        a = Math.abs(entrada.pedir());
        
        System.out.println("Ingresa la cantidad de metros cubicos: ");
        b = Math.abs(entrada.pedir());

        obj = new BigDecimal(resultado.multiplicar(a, b));
        obj = obj.setScale(2, RoundingMode.DOWN);

        if (obj.doubleValue()%1 == 0){
            System.out.println("Precio a pagar: $" + ((long)obj.doubleValue()));
        }else{
            System.out.println("Precio a pagar: $" + obj.doubleValue());
        }
    }

}
