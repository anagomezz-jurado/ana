/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Metodos.ejercicios2;

import java.util.Scanner;

/**
14. Crea una función "ContarLetra", que reciba una cadena y una letra, y devuelva
la cantidad de veces que dicha letra aparece en la cadena. Por ejemplo, si la
cadena es "Barcelona" y la letra es "a", debería devolver 2 (porque la "a" aparece
2 veces).
 */

public class Ejercicio14 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        String frase;
        char letra = 0;
        
        System.out.print("Dim una frase: ");
        frase = sc.nextLine();
        
        System.out.print("Dime una letra: ");
        letra = sc.nextLine().charAt(letra);
        
        cantidad = ContarLetra(frase, letra);
        
        System.out.println("La letra " + letra + " aparece: "+ cantidad + " veces ");
    }
   
    static int ContarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}