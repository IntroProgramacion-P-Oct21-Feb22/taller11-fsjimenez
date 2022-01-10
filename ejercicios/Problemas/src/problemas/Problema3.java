/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese una nota");
            notas[i] = entrada.nextDouble();
        }
        obtenerPromedios(notas);
    }

    public static void obtenerPromedios(double[] promedios) {
        double suma = 0;
        double promedio;
        String cadena = "";
        for (int i = 0; i < promedios.length; i++) {
            suma = suma + promedios[i];
        }
        promedio = suma / promedios.length;
        for (int i = 0; i < promedios.length; i++) {
            cadena = String.format("%s%s, ", cadena, promedios[i]);
        }
        if (promedio >= 0 && promedio <= 5) {
            System.out.printf("El promedio de las notas: %ses Regular", cadena);
        } else {
            if (promedio > 5 && promedio <= 8) {
                System.out.printf("El promedio de las notas: %ses Bueno", cadena);
            } else {
                if (promedio > 8 && promedio <= 9) {
                    System.out.printf("El promedio de las notas: %ses Muy Bueno",
                            cadena);
                }else{
                    if (promedio > 9 && promedio <= 10) {
                        System.out.printf("El promedio de las notas: %ses "
                                + "Sobresaliente", cadena);
                    }
                }
            }
        }
    }

}
