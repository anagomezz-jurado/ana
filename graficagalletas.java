/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
 */
public class graficagalletas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] galletas = new int[7];
        rellenarArray(galletas, scanner);
        System.out.println("\nGráfica de consumo de galletas:");
        dibujarGrafica(galletas);
        scanner.close();
    }

    public static void rellenarArray(int[] array, Scanner scanner) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < array.length; i++) {
            int galletas;
            do {
                System.out.print("¿Cuántas galletas comiste el " + dias[i] + "? (0-10): ");
                galletas = scanner.nextInt();
                if (galletas < 0 || galletas > 10) {
                    System.out.println("Número inválido. Debe estar entre 0 y 10.");
                }
            } while (galletas < 0 || galletas > 10);
            array[i] = galletas;
        }
    }

    public static void dibujarGrafica(int[] array) {
        int maxGalletas = 10;

        for (int i = maxGalletas; i > 0; i--) {
            for (int galletas : array) {
                if (galletas >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println(" L " + " M  " + "X" + " J " + " V " + " S " + " D");
    }
}
