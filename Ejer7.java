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
public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num; 
        
        System.out.print("Dime un número: "); 
        num = sc.nextInt();
        
        
        switch (num) {
            case 1:
                System.out.println(" 1.- Procesador de textos ");
                break;
            case 2:
                System.out.println(" 2.- Hoja de cálculo ");
                break;
                
            case 3:
                System.out.println(" Bases de datos ");
                break;
            default:
                System.out.println("OPCIÓN INCORRECTA");
        }
    }
}
