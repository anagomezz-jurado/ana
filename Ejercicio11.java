/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
11.- Realiza una aplicación que lea una cadena y la imprima. Debes considerar
que la cadena no puede tener más de un espacio en blanco entre las palabras.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime una cadena: ");
        String cadena = sc.nextLine();
        
        String resultado = cadena.replaceAll("\\s+", " ");
        
        System.out.println("El resultado de la cadena es: " + resultado);
       
    }
}
