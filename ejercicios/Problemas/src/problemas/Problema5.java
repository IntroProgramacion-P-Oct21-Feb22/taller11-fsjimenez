/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {
    public static void main(String[] args){    
        int suma;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        suma = obtenerSuma(informacion);
        System.out.println(suma);
    }
    
    public static int obtenerSuma(int[][] informacion){
        int suma = 0;
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                suma = suma + informacion[i][j];
            }
        }
        return suma;
    }
}
