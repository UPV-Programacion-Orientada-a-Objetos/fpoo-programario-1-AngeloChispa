package edu.upvictoria.fpoo.programaVeintitres;

/**
 * IVA
 */
public class IVA {

    public double calcular(double a){

        return a+a*0.15;

    }

    public IVA(double a){

        System.out.println("El precio con total con IVA es: $" + calcular(a));


    }


}