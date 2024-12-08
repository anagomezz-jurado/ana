/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
17. Implemente una función llamada al revés que pida en el main un string
cualquiera, pase esa cadena a la función “revés” y muestre en el main un nuevo
string que sea el inverso. (ej: entrada: “puntopeek”; salida: “keepotnup”).

 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime una cadena: ");
        String cadena = sc.nextLine();
        
        System.out.print("" + reves(cadena));
    }
    
    static String reves(String cadena){
        String reves = "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reves += cadena.charAt(i);
            
        }
        return reves;
        
    }
}
