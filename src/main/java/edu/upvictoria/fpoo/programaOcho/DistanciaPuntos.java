package edu.upvictoria.fpoo.programaOcho;

/**
 * DistanciaPuntos
 */
public class DistanciaPuntos {

    public double distancia(double a1, double b1, double a2, double b2){

        return Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        
    }

}