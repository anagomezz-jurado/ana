/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
10.- Realiza una aplicación que permita introducir una cadena de 80 caracteres
como máximo y mostrarla al revés.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una cadena (menor de 80 caracteres)");
        String cadena = sc.nextLine();
            
            if (cadena.length() > 80) {
                System.out.println("Inválido, la cadena debe tener menos de 80 caracteres");
            } else {
            
                String inverso = cadenaInversa(cadena);
                System.out.println("Cadena invertida: " + inverso);
            }
        
    }
    static String cadenaInversa(String cadena){
        String inversa = "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa += cadena.charAt(i);
        }
        
        return inversa;
    }
}
