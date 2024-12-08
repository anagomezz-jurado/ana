/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author anago
 */
public class Ejer9 {
    public static void main(String[] args) {
        int i, j;
        
        for (i = 1; i <= 10; i++){
            System.out.println("");
            System.out.println("La tabla del "+ i);
            
            for (j = 1; j <= 10; j++){
                System.out.println( i + " x " + j + " = " + (i*j));
            }
        }
    }
}
