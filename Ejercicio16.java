/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
 * 16.- Realiza una aplicación que cree un array bidimensional llamado MAT
 * [5][3]. Luego, muestra la suma de cada una de sus filas y la suma de cada una
 * de sus columnas.
 *
 * Ejercicio: Le pasas un texto y te devuelve un array con todas las palabras
 * del texto (sin repetir) otro metodo que devuelva cuantas veces aparece cada
 * palabra
 *
 *
 * static String[] sinRepetir(String textoOriginal){}
 *
 * static int[] repeticiones(String[] palabras, String textoOriginal)
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] MAT = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        int sumaTotal = 0;

        System.out.println("                    TOTAL");
        for (int fila = 0; fila < MAT.length; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < MAT[fila].length; columna++) {
                sumaFila += MAT[fila][columna];
                System.out.printf("|%4d ", MAT[fila][columna]);
            }
            System.out.println(" | " + sumaFila);
        }
        System.out.println("- - - - - - - - - - - - -");

        for (int columna = 0; columna < MAT[0].length; columna++) {  //MAT[0].length == 3
            int sumaColumna = 0;
            for (int fila = 0; fila < MAT.length; fila++) {
                sumaColumna += MAT[fila][columna];
            }
            System.out.printf("|%4d ",sumaColumna);
            sumaTotal += sumaColumna;
        }
        
        System.out.printf("|%4d",sumaTotal);
    }

}
