/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
 * 16. Crea una función "Iniciales", que reciba una cadena como "Marta Castaña"
 * y devuelva las letras M y C (primera letra, y letra situada tras el primer
 * espacio). Crea un "Main" que te pida la cadena y se pase a la función para
 * que ésta imprima los resultados. Hazla dos versiones, una usando el método
 * Split y otro sin usar ese método.
 *
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.print("Dime una cadena: ");
        cadena = sc.nextLine();

        //System.out.println("" + Iniciales(cadena));

        System.out.println("" + InicialesSplit(cadena));
    }
/*
     static String Iniciales(String cadena) {
        String nombrePartido;
        String resultado = ""+cadena.charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            String caracter = ""+cadena.charAt(i);
            if(caracter.equals(" ")){
                nombrePartido = cadena.substring(i + 1, cadena.length()-1)
            }
        }
    }
    */
   

    static String InicialesSplit(String cadena) {
        String[] palabras = cadena.split(" ");
        return "" + palabras[0].charAt(0) + palabras[1].charAt(0);
    }

}
