/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejercicio15Paniagua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame una letra: ");
        String cadena = sc.nextLine();
        
        System.out.println((esVocal(cadena)?"Es vocal":"No es vocal"));
    }

    static boolean esVocal(String cadena) {
        return ("aeiou".contains(cadena));
    }
}
