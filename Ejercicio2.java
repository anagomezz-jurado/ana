/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
 * 2.- Considera un array t de 2 por 3 de enteros. a) Realiza una sentencia que
 * declare y cree t. b) ¿Cuántas filas tiene t? c) ¿Cuántas columnas tiene t? d)
 * ¿Cuántos elementos tiene t? e) Escribe expresiones de acceso para todos los
 * elementos de la fila 1 de t. f) Escribe expresiones de acceso para todos los
 * elementos de la columna 2 de t. g) Escribe una sentencia sencilla que
 * establezca el elemento de t de la fila 0 y columna 1 a 0. h) Escribe una
 * serie de sentencias que inicialicen cada elemento de t a 0. No uses una
 * sentencia de repetición. i) Escribe una sentencia for anidada que inicialice
 * cada elemento de t a 0. j) Escribe una sentencia for anidada para introducir
 * los valores de t del usuario. k) Escribe una serie de sentencias que calcule
 * y muestre el valor más pequeño en t. l) Escribe una sentencia printf que
 * muestre los elementos de la primera fila de t. No usar repetición. m) Escribe
 * una sentencia que totalice los elementos de la tercera columna de t. No usar
 * repetición. n) Escribe una serie de sentencias que muestre el contenido de t
 * en formato tabular. Lista los índices de columnas como encabezados en la
 * parte superior, y lista los índices de fila a la izquierda de cada fila.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[][] t = new int[2][3];

        int filas = t.length;

        int columnas = t[0].length;

        int elementos = t.length * t[0].length;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("Introduce el valor para t[%d][%d]: ", i, j);
                t[i][j] = sc.nextInt();
            }
        }

        int min = t[0][0];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < min) {
                    min = t[i][j];
                }
            }
        }

        System.out.println("El valor más pequeño en t es: " + min);

        System.out.printf("%d %d %d\n", t[0][0], t[0][1], t[0][2]);
        int total = t[0][2] + t[1][2];
        System.out.println("Total de la tercera columna: " + total);

        // Mostrar encabezados de columnas
        System.out.print("\t");
        for (int col = 0; col < t[0].length; col++) {
            System.out.print("Col " + col + "\t");
        }
        System.out.println();

// Mostrar los índices de fila y los valores de `t`
        for (int i = 0; i < t.length; i++) {
            System.out.print("Fila " + i + "\t");
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
