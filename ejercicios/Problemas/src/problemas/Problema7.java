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
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el número de ciudades a ingresar:");
        numero = entrada.nextInt();
        String ciudades[] = new String[numero];
        ciudades = obtenerCiudades(ciudades, numero);
        imprimir(ciudades);
    }

    public static String[] obtenerCiudades(String[] city, int num) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese una ciudad");
            city[i] = entrada.nextLine();
        }
        return city;
    }

    public static void imprimir(String[] ciudades) {
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].length() == 4 || ciudades[i].length() == 5) {
                System.out.printf("Ciudades con 4 o 5 caracteres: %s",
                        ciudades[i]);
            }
        }

    }
}
