package edu.upvictoria.fpoo.programaTres;

/**
 * PropiedadesRectangulo
 */
public class PropiedadesRectangulo {

    public boolean medidas(double a, double b){

        boolean bandera = false;

        if(a == b){
            bandera = true;
            System.out.println("============================================");
            System.out.println("La altura y la base no pueden medir lo mismo");
            System.out.println("============================================\n");
        }

        return bandera;
    }


}