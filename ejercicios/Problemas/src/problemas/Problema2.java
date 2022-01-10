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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado = 0;
        double base = 0;
        double altura = 0;
        int numero;
        System.out.println("Ingrese un número para presentar el resultado (1, 2 o 3)");
        numero = entrada.nextInt();

        if (numero == 1) {
            obtenerAreaCuadrado(lado);
        } else {
            if (numero == 2) {
                obtenerAreaTriangulo(base, altura);
            } else {
                if (numero == 3) {
                    obtenerAreaRectangulo(base, altura);
                } else {
                    System.out.println("Valor incorrecto");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado(double l) {
        Scanner entrada = new Scanner(System.in);
        double area;
        System.out.println("Ingrese el valor del lado");
        l = entrada.nextDouble();
        area = l * l * l * l;
        System.out.printf("El área del cuadrado es: %.2f\n", area);
    }
    
    public static void obtenerAreaTriangulo(double b, double h) {
        Scanner entrada = new Scanner(System.in);
        double area;
        System.out.println("Ingrese el valor de la base");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        h = entrada.nextDouble();
        area = (b*h)/2;
        System.out.printf("El área del triangulo es: %.2f\n", area);
    }
    
    public static void obtenerAreaRectangulo(double b, double h) {
        Scanner entrada = new Scanner(System.in);
        double area;
        System.out.println("Ingrese el valor de la base");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        h = entrada.nextDouble();
        area = (b*h);
        System.out.printf("El área del rectangulo es: %.2f\n", area);
    }
}
