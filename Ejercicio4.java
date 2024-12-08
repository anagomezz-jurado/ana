/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
 * 4.- (Eliminación de duplicados) Usa un array unidimensional para resolver el
 * siguiente problema: Realiza una aplicación que introduzca 5 números, cada uno
 * entre 10 y 100, inclusive. A medida que se lea cada número, mostrarlo sólo si
 * no es un duplicado de un número ya leído. Prevee el “peor de los casos”, en
 * el que los 5 números sean diferentes. Usa la matriz más pequeña posible para
 * resolver este problema. Muestra el conjunto completo de entrada de valores
 * únicos después de que el usuario introduzca un nuevo valor.
 *
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 10 || numero > 100) {
                System.out.println("Número fuera de rango. Introduce un número entre 10 y 100.");
                i--;
                continue;
            }

            boolean duplicado = false;
            for (int j = 0; j < contador; j++) {
                if (numeros[j] == numero) {
                    duplicado = true;
                }
            }

            if (!duplicado) {
                numeros[contador] = numero;
                contador++;
                System.out.println("Número aceptado: " + numero);
            } else {
                System.out.println("Número duplicado. No se añadirá.");
            }

            System.out.print("Números únicos actuales: ");
            for (int j = 0; j < contador; j++) {
                System.out.print(numeros[j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < contador; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

    }
}
