package edu.upvictoria.fpoo.programaOnce;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * ProgramaOnce
 */
public class ProgramaOnce {

    public void programaOnce() throws IOException{

        double largo = 0, ancho = 0, altura = 0, precio = 0;

        InputNumbers entrada = new InputNumbers();
        prismaRectangular obj = new prismaRectangular();

        System.out.println("Ingrese el precio de agua por metro cuadrado: ");
        precio = Math.abs(entrada.pedir());

        System.out.println("Ingresa la altura: ");
        altura = Math.abs(entrada.pedir());
        System.out.println("Ingresa el ancho: ");
        ancho = Math.abs(entrada.pedir());
        System.out.println("Ingresa el largo: ");
        largo = Math.abs(entrada.pedir());

        System.out.println("El precio a pagar es: " + (obj.volumen(ancho, altura,largo)*precio));


    }
}