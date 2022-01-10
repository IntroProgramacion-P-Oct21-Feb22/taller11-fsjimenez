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
public class Problema6 {
    public static void main(String[] args) {
        double media;
        double desviacion;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media = media(informacion);
        desviacion = desviacionEstandar(informacion, media);
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Desviacion estándar: %.2f\n", desviacion);
    }
    
    public static double media(int[] info){
        int suma = 0;
        double promedio;
        for (int i = 0; i < info.length; i++) {
            suma = suma + info[i];           
        }
        promedio = suma / info.length;
        return promedio;
    }
    
    public static double desviacionEstandar(int info[], double media){
        double[] x = new double[9];
        double suma = 0;
        double s;
        for (int i = 0; i < x.length; i++) {
           x[i] = Math.pow(info[i] - media, 2); 
           suma = suma + x[i];
        }
        s = Math.sqrt(suma / (x.length - 1));
        return s;
    }
}

