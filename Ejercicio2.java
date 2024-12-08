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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ancho, altura, i, j;
        
        System.out.println("Dime un número para el ancho cuadrado: ");
        ancho = sc.nextInt();
         System.out.println("Dime un número para la altura cuadrado: ");
        altura = sc.nextInt();
        
        for (i = 0; i < altura; i++){
            for (j = 0; j < ancho; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
