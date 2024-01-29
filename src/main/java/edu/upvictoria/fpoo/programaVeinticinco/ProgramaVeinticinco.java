package edu.upvictoria.fpoo.programaVeinticinco;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaVeinticinco
 */
public class ProgramaVeinticinco {

    public ProgramaVeinticinco()throws IOException{

        double dias = 0,  hotel = 0, comida = 0;

        InputNumbers entrada = new InputNumbers();
        BigDecimal obj;

        System.out.println("Ingrese el numero de dias en Monterrey: ");
        dias= Math.abs(entrada.pedir());

        System.out.println("Ingrese el precio del hotel: ");
        hotel= Math.abs(entrada.pedir());

        System.out.println("Ingrese el precio de la comida: ");
        comida = Math.abs(entrada.pedir());

        obj = new BigDecimal((hotel+comida+100)*dias);
        obj = obj.setScale(2, RoundingMode.DOWN);

        System.out.println("La cantidad a gastar es de: $" + obj.doubleValue());

    }


}