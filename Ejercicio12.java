/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
12. Crea una función "UltimaLetra", que devuelva la última letra de una cadena de
texto. Prueba esta función para calcular la última letra de la frase "Hola".
* En Java, los índices comienzan en 0, por lo que el índice del último carácter es siempre longitud - 1.
Para "Hola", el último índice es 4 - 1 = 3.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase;
        
        System.out.print("Dime una palabra: ");
        frase = sc.nextLine();
        
        System.out.println("La ultima letra de la cadena es: " + ultimaLetra(frase));
    }
    
     static char ultimaLetra(String frase) {
        String sinEspacios = frase.trim();
        return sinEspacios.charAt(sinEspacios.length()-1);
    }
}
