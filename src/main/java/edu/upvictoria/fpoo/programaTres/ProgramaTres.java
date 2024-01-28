package edu.upvictoria.fpoo.programaTres;


import java.io.IOException;
import edu.upvictoria.fpoo.Utilidades.InputNumbers;
import edu.upvictoria.fpoo.Utilidades.Multiplicacion;
import edu.upvictoria.fpoo.Utilidades.Geometria.PropiedadesRectangulo;

/**
 * ProgramaTres
 */
public class ProgramaTres {

    public void programaTres() throws IOException{

        double base = 0, altura = 0;
        boolean bandera = true;

        InputNumbers entrada = new InputNumbers();
        PropiedadesRectangulo obj = new PropiedadesRectangulo();
        Multiplicacion salida = new Multiplicacion();

        while (bandera) {
            System.out.println("Ingrese la base: ");
            base = Math.abs(entrada.pedir());
            System.out.println("Ingrese la altura: ");
            altura = Math.abs(entrada.pedir());
            bandera = obj.medidas(altura, base);
            if(bandera){
                System.out.println("============================================");
                System.out.println("La altura y la base no pueden medir lo mismo");
                System.out.println("============================================\n");
            }
        }

        System.out.println("Area del rectangulo: "+ salida.multiplicar(altura, base));
    }
}