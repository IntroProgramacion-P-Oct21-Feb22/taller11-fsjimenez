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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cedula;
        String nombre;
        int condicion;
        System.out.println("Ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese 1 para calcular la planilla de la luz y 2 "
                + "para calcular el valor del predio");
        condicion = entrada.nextInt();
        if (condicion == 1) {
            obtenerPlanilla(cedula, nombre);
        }else{
            if (condicion == 2) {
                obtenerPredio(cedula, nombre);
            }else{
                System.out.println("Valor no permitido");
            }
        }
    }
    
    public static void obtenerPlanilla(String c, String n){
        Scanner entrada = new Scanner(System.in);
        double valorkW;
        double numerokW;
        double valorPlanilla;
        System.out.println("Ingrese el valor del kilowaltio");
        valorkW = entrada.nextDouble();
        System.out.println("Ingrese el numero de kW consumidos");
        numerokW = entrada.nextDouble();
        valorPlanilla = valorkW * numerokW;
        System.out.printf("Cliente %s con cedula %s debe cancelar un valor "
                + "de $%s", n, c, valorPlanilla);
    }
    
    public static void obtenerPredio(String c, String n){
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        int porcentaje = 2;
        double valorPredio;
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = (valorInmueble * porcentaje)/100;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
           + "valorado en $%s y tiene que pagar de predio $%s", n, 
                                                                c, 
                                                                valorInmueble,
                                                                valorPredio);
    }

}
