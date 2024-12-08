/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

/**
 * 1.- Escribe sentencias Java para realizar cada una de las siguientes tareas:
 * a) Muestra el valor del elemento 6 de un array f. 
 * b) Inicializa los 5
 * primeros elementos de un array unidimensional de enteros g a 8. 
 * c) Total de
 * los 100 elementos de punto-flotante de un array c. 
 * d) Copia los 11 elementos
 * de un array a en la primera porción de un array b, el cual contiene 34
 * elementos. 
 * e) Calcula y muestra el valor mayor y menor contenidos en un array
 * w de 99 elementos de punto-flotante.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        float[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(numeros[6]);

        int[] g = new int[10];

        for (int i = 0; i < 5; i++) {
            g[i] = 8;
        }

        float[] c = new float[100];
        float total = 0;
        for (float num : c) {
            total += num;
        }

        System.out.println("Total " + total);

        int[] a = new int[11];
        int[] b = new int[34];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        float[] w = new float[99];
        float max = w[0];
        float min = w[0];

        for (float num : w) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

      
        
        System.out.println("Valor mayor es: " + max);
        System.out.println("Valor menor es: " + min);
    }

}
