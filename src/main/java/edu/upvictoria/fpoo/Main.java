package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.programaDos.ProgramaDos;
import edu.upvictoria.fpoo.programaNueve.ProgramaNueve;
import edu.upvictoria.fpoo.programaOcho.ProgramaOcho;
import edu.upvictoria.fpoo.programaOnce.ProgramaOnce;
import edu.upvictoria.fpoo.programaQuince.ProgramaQuince;
import edu.upvictoria.fpoo.programaSeis.ProgramaSeis;
import edu.upvictoria.fpoo.programaSiete.ProgramaSiete;
import edu.upvictoria.fpoo.programaTrece.ProgramaTrece;
import edu.upvictoria.fpoo.programaTres.ProgramaTres;
import edu.upvictoria.fpoo.programaUno.ProgramaUno;
import edu.upvictoria.fpoo.programaVeinte.ProgramaVeinte;
import edu.upvictoria.fpoo.programaVeinticinco.ProgramaVeinticinco;
import edu.upvictoria.fpoo.programaVeinticuatro.Ahorrar;
import edu.upvictoria.fpoo.programaVeintidos.ProgramaVeintidos;
import edu.upvictoria.fpoo.programaVeintiseis.ProgramaVeintiseis;
import edu.upvictoria.fpoo.programaVeintitres.ProgramaVeintitres;
import edu.upvictoria.fpoo.programaVeintiuno.ProgramaVeintiuno;
import edu.upvictoria.fpoo.Utilidades.RangoNumeros;
import edu.upvictoria.fpoo.programaCatorce.ProgramaCatorce;
import edu.upvictoria.fpoo.programaCinco.ProgramaCinco;
import edu.upvictoria.fpoo.programaCuatro.ProgramaCuatro;
import edu.upvictoria.fpoo.programaDiecinueve.ProgramaDiecinueve;
import edu.upvictoria.fpoo.programaDieciocho.ProgramaDieciocho;
import edu.upvictoria.fpoo.programaDieciseis.ProgramaDieciseis;
import edu.upvictoria.fpoo.programaDiecisiete.ProgramaDiecisiete;
import edu.upvictoria.fpoo.programaDiez.ProgramaDiez;
import edu.upvictoria.fpoo.programaDoce.ProgramaDoce;
import edu.upvictoria.fpoo.programaVeinticuatro.ProgramaVeinticuatro;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        
        int respuesta = 0;
        boolean bandera = true, banderaDos = true;

        InputMain entrada = new InputMain();
        ProgramaUno uno = new ProgramaUno();
        ProgramaDos dos = new ProgramaDos();
        ProgramaTres tres = new ProgramaTres();
        ProgramaCuatro cuatro = new ProgramaCuatro();
        ProgramaCinco cinco = new ProgramaCinco();
        ProgramaSeis seis = new ProgramaSeis();
        ProgramaSiete siete = new ProgramaSiete();
        ProgramaOcho ocho = new ProgramaOcho();
        ProgramaNueve nueve = new ProgramaNueve();
        ProgramaDiez diez = new ProgramaDiez();
        ProgramaOnce once = new ProgramaOnce();
        ProgramaDoce doce = new ProgramaDoce();
        ProgramaTrece trece = new ProgramaTrece();
        ProgramaCatorce catorce = new ProgramaCatorce();
        ProgramaQuince quince = new ProgramaQuince();
        ProgramaDieciseis dieciseis = new ProgramaDieciseis();
        ProgramaDiecisiete diecisiete = new ProgramaDiecisiete();
        RangoNumeros rango = new RangoNumeros();

        while (banderaDos) {

            bandera = true;

            System.out.println("Lista de programas\n\n");         
            System.out.println("1.- Suma de dos números");
            System.out.println("2.- Promedio de exámenes");
            System.out.println("3.- Area de un rectangulo");
            System.out.println("4.- Area de una circunferencia");
            System.out.println("5.- Area de un terreno");
            System.out.println("6.- Area de la figura");
            System.out.println("7.- Convertir litros a galones.");
            System.out.println("8.- Distancia entre 2 puntos.");
            System.out.println("9.- Paga semanal.");
            System.out.println("10.- Convertir metros a pulgadas.");
            System.out.println("11.- Conagua.");
            System.out.println("12.- Area de un triangulo.");
            System.out.println("13.- Convertir dolares a pesos");
            System.out.println("14.- Determinar edad.");
            System.out.println("15.- Precio estacionamiento.");
            System.out.println("16.- La brocha gorda.");
            System.out.println("17.- Sacar Hipotenusa.");
            System.out.println("18.- Precio por kilometro.");
            System.out.println("19.- Distancia recorrida en vici.");
            System.out.println("20.- Precio por llamada");
            System.out.println("21.- CONAGUA 2");
            System.out.println("22.- CLS");
            System.out.println("23.- Descuentos e IVA.");
            System.out.println("24.- Ahorro ");
            System.out.println("25.- Viaje a Monterrey.");
            System.out.println("26.- Viaje a Monterrey 2.");

            while (bandera) {
                System.out.print("\n\nIngrese la opcion seleccionada: ");
                respuesta = entrada.selecion();
                bandera = rango.validos(respuesta, 1, 26);
            }
 
        
            switch (respuesta) {
                case 1:
                
                    uno.programaUno();
                    System.out.println();
                    break;
                case 2:
                    dos.programaDos();
                    System.out.println();
                    break;
                case 3:
                    tres.programaTres();
                    System.out.println();
                    break;
                case 4: 
                    cuatro.programaCuatro();
                    System.out.println();
                    break;
                case 5: 
                    cinco.programaCinco();
                    System.out.println();
                    break;
                case 6:
                    seis.programaSeis();
                    System.out.println();
                    break;
                case 7: 
                    siete.programaSeis();
                    System.out.println();
                    break;
                case 8:
                    ocho.programaOcho();
                    System.out.println();
                    break;
                case 9:
                    nueve.programaNueve();
                    System.out.println();
                    break;
                case 10:
                    diez.programaDiez();
                    System.out.println();
                    break;
                case 11:
                    once.programaOnce();
                    System.out.println();
                    break;
                case 12:
                    doce.programaDoce();
                    System.out.println();
                    break;
                case 13:
                    trece.programaTrece();
                    System.out.println();
                    break;
                case 14:
                    catorce.programaCatorce();
                    System.out.println();
                    break;
                case 15:
                    quince.programaQuince();
                    System.out.println();
                    break;    
                case 16: 
                    dieciseis.programaDieciseis();
                    System.out.println();
                    break;    
                case 17: 
                    diecisiete.programaDiecisiete();
                    System.out.println();
                    break;
                case 18:
                    new ProgramaDieciocho();
                    break;
                case 19: 
                    new ProgramaDiecinueve();
                    break;
                case 20:
                    new ProgramaVeinte();
                    break;
                case 21:
                    new ProgramaVeintiuno();   
                    break;
                case 22:
                    new ProgramaVeintidos();
                    break;
                case 23:
                    new ProgramaVeintitres();
                    break;
                case 24: 
                    new ProgramaVeinticuatro();
                    break;
                case 25: 
                    new ProgramaVeinticinco();
                    break;
                case 26: 
                    new ProgramaVeintiseis();
            }

            System.out.println("¿Quieres correr otro programa\n1.- Si\n2.- No");
            respuesta = entrada.selecion();
            if ( respuesta != 1){
                banderaDos = false;
            }
        }

        

    }
}