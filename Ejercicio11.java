/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
11. Crea una función "Inicial", que devuelva la primera letra de una cadena de texto.
Prueba esta función para calcular la primera letra de la frase "Hola".
La expresión cadena.substring(0, 1) en Java se utiliza para obtener una subcadena 
* de cadena que comienza en el índice 0 y termina justo antes del índice 1
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        
        System.out.print("Dime una palabra: ");
        cadena = sc.nextLine();
        
        System.out.println("La primera letra de la cadena es: " + Inicial(cadena));
    }
    
    static String Inicial (String cadena){
         return cadena.substring(0, 1); 
    }
}
