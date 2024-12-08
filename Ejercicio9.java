/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
9.- Realiza una aplicación que permita la introducción de una cadena y cuente
el número de palabras que hay en ella. Tienes que mostrar cada una de las
palabras en una línea separada. 
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
       
        String[] palabras = cadena.split(" ");
        
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        int numPalabras = palabras.length;
        System.out.println("Hay un total de " + numPalabras + " palabras.");
        
    }
}
