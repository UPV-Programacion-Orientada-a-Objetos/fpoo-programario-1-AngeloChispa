package edu.upvictoria.fpoo.programaSeis;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Geometria.AreaCircunferencia;
import edu.upvictoria.fpoo.Utilidades.Geometria.TeoremaPitagoras;

/**
 * programaSeis
 */
public class ProgramaSeis {

    public void programaSeis() throws IOException{
        
        double radio = 0, hipotenusa = 0;

        InputNumbers entrada = new InputNumbers();
        AreaCircunferencia circulo = new AreaCircunferencia();
        TeoremaPitagoras calculo = new TeoremaPitagoras();

        System.out.print("Ingrese la medida de R: ");
        radio = Math.abs(entrada.pedir());
        System.out.print("Ingrese la medida de H: ");
        hipotenusa = Math.abs(entrada.pedir());

        System.out.println("El area de la figura es: " +((circulo.area(radio)/2)+(calculo.CatetoHipotenusa(radio, hipotenusa)*radio)));

    }


}