/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
18. Implemente una función “subcadena” que dado un string, una posición de
comienzo y una cantidad de caracteres, devuelva una subcadena (substring) de
una cadena dada a partir de los parámetros dados (ej: entrada: “puntopeek”,
pos= 2, cant= 4; salida: “unto”.). Pide la cadena en el main y pásala como
referencia a la función. El resultado imprímelo en el main.

 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palabra;
        int posicion, cantidad;
        
        System.out.print("Dime una palabra: ");
        palabra = sc.nextLine();
        System.out.print("Dime una posicion: ");
        posicion = sc.nextInt();
        System.out.print("Dime una cantidad: ");
        cantidad = sc.nextInt();
        
        String cadena = subcadena(palabra, posicion, cantidad);
        
        System.out.println("El resultado es: " + cadena);
    }
    
    static String subcadena(String palabra, int posicion, int cantidad){
        
        return palabra.substring(posicion, posicion + cantidad);
    }
}
