package edu.upvictoria.fpoo.programaDos;

/**
 * InputProDos
 */
public class FormatoNumeros{

    public double formato(double a){

        if (a<0){
            a = Math.abs(a);
        }

        if (a>10 && a<11){
            //Esto es por que Math.round() devuelve un long
            a = (double) Math.floor(a);
        }else if(a>10){
            a *= 0.10;   
        }

        return a;
    }
    
}