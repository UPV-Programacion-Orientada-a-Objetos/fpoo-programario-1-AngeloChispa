package edu.upvictoria.fpoo.programaCinco;

import java.io.IOException;

import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Multiplicacion;
import edu.upvictoria.fpoo.Utilidades.Geometria.PropiedadesRectangulo;

/**
 * ProgramaCInco
 */
public class ProgramaCinco {

    public void programaCinco() throws IOException{

        double a = 0,  b = 0;
        boolean bandera = true;

        InputNumbers entrada = new InputNumbers();
        PropiedadesRectangulo obj = new PropiedadesRectangulo();
        Multiplicacion producto = new Multiplicacion();

        while (bandera) {
            
            System.out.println("Ingresa un número: ");
            a = Math.abs(entrada.pedir());
            System.out.println("Ingresa otro número: ");
            b = Math.abs(entrada.pedir());
            bandera = obj.medidas(a,b);
            if(bandera){
                System.out.println("===================================================");
                System.out.println("Las medidas de \"a\" y \"b\" no pueden medir lo mismo");
                System.out.println("===================================================\n");
            }
        }
        
        System.out.println("El area del terreno es: " + producto.multiplicar(a, b) + (producto.multiplicar(a, b)/2));

    }

}