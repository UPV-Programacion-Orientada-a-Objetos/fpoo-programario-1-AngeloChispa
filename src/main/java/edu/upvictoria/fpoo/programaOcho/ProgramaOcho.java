package edu.upvictoria.fpoo.programaOcho;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;

/**
 * programaOcho
 */
public class ProgramaOcho {

    public void programaOcho() throws IOException{
        
        double[] puntos = new double[4];
        InputNumbers entrada = new InputNumbers();
        DistanciaPuntos resultado = new DistanciaPuntos();

        System.out.print("Ingresa la coordenada x del punto 1: ");
        puntos[0] = entrada.pedir();
        System.out.print("Ingresa la coordenada y del punto 1: ");
        puntos[1] = entrada.pedir();
        System.out.print("\nIngresa la coordenada x del punto 2: ");
        puntos[2] = entrada.pedir();
        System.out.print("Ingresa la coordenada y del punto 2: ");
        puntos[3] = entrada.pedir();

        System.out.println("\nLa distancia entre los puntos dados es: "+ resultado.distancia(puntos[0], puntos[1], puntos[2], puntos[3]));

    }    

}