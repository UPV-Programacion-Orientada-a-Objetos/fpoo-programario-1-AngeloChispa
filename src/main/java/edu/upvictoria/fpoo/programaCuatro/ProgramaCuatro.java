package edu.upvictoria.fpoo.programaCuatro;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.RangoNumeros;

/**
 * ProgramaCuatro
 */
public class ProgramaCuatro {

    public void programaCuatro() throws IOException{

        boolean bandera = true;
        double numero = 0;

        InputNumbers entrada = new InputNumbers();
        RangoNumeros comprobar = new RangoNumeros();
        AreaCircunferencia resultado = new AreaCircunferencia();
        
        while (bandera) {
            System.out.println("¿Qué deseas usar?");
            System.out.println("1.- Radio");
            System.out.println("2.- Diametro");
            numero = entrada.pedir();
            comprobar.validos((long)numero, 1, 2);
        }

        if (numero == 1){
            System.out.println("Ingresa el radio: ");
            numero = Math.abs(entrada.pedir());
        }else{
            System.out.println("Ingresa el diametro: ");
            numero = (Math.abs(entrada.pedir()))/2; 
        }

        System.out.println("Area de la circunferencia: "+resultado.area(numero));

    }


}