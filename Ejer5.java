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
public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int edad;
    
    System.out.print("Dime tu edad: ");
    edad = sc.nextInt();
    
    if (edad <12){
        System.out.println("Es un niño");
    } else if (edad >12 && edad<18){
        System.out.println("Eres un adolescente");
    } else if (edad >18 && edad <65){
        System.out.println("Eres un adulto");
    }else if (edad>65){
        System.out.println("Eres un anciano");
    }
}
}
