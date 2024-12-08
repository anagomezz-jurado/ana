/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclefor;

import java.util.Scanner;

/**
 *
 * @author anago
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int filas, i, j, k;
        
        System.out.println("Dime el número de filas: ");
        filas = sc.nextInt();
        
        //PRIMER TRIANGULO
        for (i = 1; i <= filas; i++){
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        //SEGUNDO TRIANGULO
        for (i = 1; i <= 2 * filas - 1; i++){
           int espacios;
            int asteriscos;

            // Parte superior del rombo
            if (i <= filas) {
                espacios = filas - i;
                asteriscos = 2 * i - 1;
            } 
            // Parte inferior del rombo
            else {
                espacios = i - filas;
                asteriscos = 2 * (2 * filas - i) - 1;
            }

            // Imprimir espacios
            for (j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (k = 0; k < asteriscos; k++) {
                System.out.print("*");
            }

            System.out.println();
        
        }
        
        
       
    }
}
