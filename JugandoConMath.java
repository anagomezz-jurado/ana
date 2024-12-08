/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author anago
 */
public class JugandoConMath {

    public static void main(String[] args) {
        int numero = 49;
        System.out.println("El valor absoluto: " + Math.abs(numero));
        System.out.println("La raíz cuadrada: " + Math.sqrt(numero));
        System.out.println("5 elevado a 6 = " + Math.pow(5, 6));
        System.out.println("Seno de 45: " + Math.sin(Math.PI / 2));
        System.out.println("Máximo y mínimo de 10 y 23: " + Math.max(10, 23) + " y " + Math.min(10, 23));
        System.out.println("Redondear: "+Math.round(5.5));
    }
}
