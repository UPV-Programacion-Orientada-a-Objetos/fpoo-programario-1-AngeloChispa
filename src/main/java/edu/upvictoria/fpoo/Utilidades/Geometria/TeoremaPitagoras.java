package edu.upvictoria.fpoo.Utilidades.Geometria;

/**
 * TeoremaPitagoras
 */
public class TeoremaPitagoras {

        public double CatetoHipotenusa(double cateto, double hipotenusa){

            double resultado = (hipotenusa*hipotenusa) - (cateto*cateto);
            resultado = Math.sqrt(resultado);

            return resultado;
        }


}