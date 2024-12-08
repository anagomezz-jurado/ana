/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import static Metodos.Ejercicio14.invertirDigitos;
import java.util.Scanner;

/**
14.- Realiza un método en Java que tome un valor entero y devuelva el número
con sus dígitos invertidos. Por ejemplo, dado el número 7631, el método debe
devolver 1367. Incorpora el método en un programa que lea un valor introducido
por el usuario y muestre el resultado.
 */
public class Ejercicio14b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String numero;
        
        System.out.print("Dime un número: ");
        numero = sc.nextLine();
        
        System.out.println("El resultado es "+ invertirDigitos(numero));
    }
    
    static String invertirDigitos(String numero){
        int longitud = numero.length();
        String invertido = "";
        for(int i=longitud; i>0; i--){
            invertido += numero.substring(i-1, i);
        }
        return invertido;
    }
   
}
