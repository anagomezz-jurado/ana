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
public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int año;
        
        System.out.println("Introduce un año: ");
        año = sc.nextInt();
        
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)){
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año +" no es un año bisiesto");
        }
    }
}
