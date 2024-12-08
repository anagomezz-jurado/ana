/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Arrays;

/**
 *
 * @author anago
 */
public class JugandoConString {
    public static void main(String[] args) {
        String nombre = "Manuel";
        String frase = "En un lugar de la Mancha";
        
        System.out.println("Longitud " +nombre.length() + " La posicion 2 es: "+ nombre.charAt(2));
        
        System.out.println("\"de\" esta en la posición "+ frase.indexOf("de"));
        
        System.out.println("\"ze\" está en la frase: " +frase.concat("ze") );
        
        System.out.println("La palabra \"Mancha\" aparece: " + frase.contains("Mancha"));
        
        System.out.println(frase.substring(3, 5));
        
        System.out.println(frase.replace("n", "*"));
        
       String frase1 = "Hola,mundo,como,estas";
       String[] palabras = frase1.split(",");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        System.out.println("         sandfñjasdfn      ".trim());
        //frase = frase.toUpperCase();
        System.out.println(frase.toUpperCase());
        
        if (nombre.equalsIgnoreCase("      Manuel      ".trim())){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
        
        String mensaje = "";  // Cadena vacía
        if (mensaje.isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            System.out.println("La cadena no está vacía y su contenido es: " + mensaje);
        }
        
        System.out.println("a".compareTo("a"));
        int numero = 42;
String texto = String.valueOf(numero);
System.out.println(texto);
    }
}
