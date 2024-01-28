package edu.upvictoria.fpoo.programaCatorce;

import java.time.LocalDate;

/**
 * CosaEdad
 */
public class CosaEdad {

    public long calcular(long a){

        LocalDate fechaActual = LocalDate.now();
        int currentYear = fechaActual.getYear();

        if (a>=currentYear){
            return 0;
        }else{
            return currentYear - a;
        }


    }


}