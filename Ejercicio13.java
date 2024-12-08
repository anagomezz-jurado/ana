/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 * 13. Crea un programa que rellene un array de 15 datos enteros y luego pida al
 * usuario el dato a buscar, avise si ese dato no aparece en el array, y que
 * diga cuántas veces se ha encontrado en caso contrario. Para ello crea las
 * funciones introducirDato() y buscarDato();
 *
 */
public class Ejercicio13 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            numeros = introducirDato(numeros, i);
        }
        System.out.println("--------------------------------");
        System.out.printf("Introduzca el dato a buscar: ");
        int dato = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Se han encontrado %d ocurrencias del numero %d \n", buscarDato(numeros, dato), dato);
    }

    static int[] introducirDato(int[] array, int i) {
        System.out.printf("Introduzca el número %d: ", i + 1);
        array[i] = scanner.nextInt();
        scanner.nextLine();
        return array;
    }

    static int buscarDato(int[] array, int n) {
        int find = 0;
        for (int num : array) {
            if (num == n) {
                find++;
            }
        }
        return find;
    }
}
