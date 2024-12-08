/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
14.- En un array llamado NOMBRES se almacenan los nombres de 5
trabajadores de una empresa. En otro array llamado TIEMPOS se almacenan
las horas que trabaja cada trabajador al mes. Tienes que implementar una
aplicación que muestre el nombre de cada trabajador y su salario. Debes saber
que la hora se cobra a 15,50€.

 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NOMBRES = {"Ana Gómez", "Loli Jurado", "Paqui López", "Pedro López", "Agustin Jurado"};
        double[] TIEMPOS = {NOMBRES.length};
        
        
        System.out.println("Dime las horas que trabaja cada trabajador: ");
        for (int i = 0; i < NOMBRES.length; i++) {
            System.out.print("Cuántas horas trabaja " + NOMBRES[i] + ": ");
            TIEMPOS[i] = sc.nextDouble();
        }
                
                
                
        double precioHora = 15.50; 
        
        System.out.println("\nSalarios de los trabajadores: ");
        for (int i = 0; i < NOMBRES.length; i++) {
            double salario = TIEMPOS[i] * precioHora; 
            System.out.println("El trabajador " + NOMBRES[i] + " ha trabajado " + TIEMPOS[i] + " horas y su salario es: " + salario + "€");
        }

    }
}
