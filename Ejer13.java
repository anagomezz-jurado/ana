/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerifswitch;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, digitos;
        
        System.out.print("Introduce un número entero (solo puede llegar hasta 5 dígitos): ");
        numero = sc.nextInt();
        
        if (numero < -9999 || numero > 99999){
            System.out.println("El número no es válido sólo se pueden hasta 5 dígitos");
        }
        else{
            if (numero < 0){
            numero = -numero;}     
            
            if (numero == 0) {
                digitos = 1;  
            } else if (numero < 10) {
                digitos = 1;
            } else if (numero < 100) {
                digitos = 2;
            } else if (numero < 1000) {
                digitos = 3;
            } else if (numero < 10000) {
                digitos = 4;
            } else {
                digitos = 5;
            }
            
            System.out.println("El número tiene "+digitos+ "digitos(s). ");
            
        }
            
            
        sc.close();  
        
        }
}
