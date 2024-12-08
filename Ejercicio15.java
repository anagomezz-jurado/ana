/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
 * 15. Desarrolla una función que devuelva verdadero o falso según si el
 * carácter que recibe como parámetro es o no una vocal (vocal=verdadero,
 * consonante=falso). Codifica una función principal donde se pidan de forma
 * continuada caracteres (finaliza cuando se introduce 0) y compruebe para cada
 * uno de ellos si se trata de una vocal o una consonante. Además tendrás que
 * comprobar que lo que se introduce es una letra y no un dígito (a excepción
 * del 0 que es para salir)
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        char letra;
        System.out.println("Introduce caracteres");
        do {
            input = sc.nextLine();

            if (input.length() == 1) {
                letra = input.charAt(0);
                    if (esVocal(letra)) {
                        System.out.println(letra + " es una vocal.");
                    } else {
                        System.out.println(letra + " es una consonante.");
                    }
            }

        } while (!input.equals("0"));

    }

    static boolean esVocal(char letra) {
        //return ("aeiou".indexOf(cadena)!=-1);
        letra = Character.toLowerCase(letra);

        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
