/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int base, exponente, resultado = 1;
        
        System.out.print("Introduce el primer número: ");
        base = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        exponente = sc.nextInt();
        
      
         for (int i = 0; i < exponente; i++){
             resultado *= base; 
         }
         
         
         System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }
}
