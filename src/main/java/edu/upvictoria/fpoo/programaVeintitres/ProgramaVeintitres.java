package edu.upvictoria.fpoo.programaVeintitres;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaVeintitres
 */
public class ProgramaVeintitres {

    public ProgramaVeintitres() throws IOException{

        double precio = 0;
        
        InputNumbers entrada = new InputNumbers();
        BigDecimal obj;

        System.out.println("Ingrese el precio base del producto: ");
        precio = Math.abs(entrada.pedir());

        precio = precio - precio*0.20;
        obj = new BigDecimal(precio);
        obj = obj.setScale(2, RoundingMode.DOWN);


        System.out.println("El precio con el descuento del 20% es: $" + obj.doubleValue());
        new IVA(precio);
        

    }


}