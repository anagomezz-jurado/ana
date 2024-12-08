/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
5.- Realiza un método en Java para contar todas las palabras en una cadena.
Datos de prueba:
Introduce la cadena: el rápido zorro marrón salta sobre el perezoso perro.
Salida esperada:
Número de palabras en la cadena: 9
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        
        System.out.println("Datos de prueba:");
        System.out.print("Introduce la cadena: ");
        cadena = sc.nextLine();
        
        int palabras = contarPalabras(cadena);
        
        System.out.println("Salida de esperada:");
        System.out.print("Número de palabras en la cadena: " + palabras);
    }
    
    static int contarPalabras(String cadena){
        int numChar = cadena.length();
        int palabras = 1;
        cadena = cadena.trim();
        for (int i = 0; i < numChar; i++) {
            if (cadena.charAt(i) == ' ' && cadena.charAt(i-1) != ' ') {
                palabras += 1; 
            }
        }
        return palabras;

    }
}
