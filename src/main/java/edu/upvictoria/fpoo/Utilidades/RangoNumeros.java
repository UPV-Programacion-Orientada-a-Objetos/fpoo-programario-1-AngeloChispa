package edu.upvictoria.fpoo.Utilidades;

/**
 * RangoNumeros
 */
public class RangoNumeros {

    public boolean validos(long a,long min, long max){

        boolean bandera = false;

        if (a< min || a>max){

            bandera = true;
            System.out.println("======================");
            System.out.println("El número no es valido");
            System.out.println("======================");

        }

        return bandera;
    }


}