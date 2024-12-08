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
public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int puntuacion;
        
        System.out.println("Dime una puntuacion entre 0 y 10: ");
        puntuacion = sc.nextInt();
        
        if (puntuacion < 0 || puntuacion > 10){
            System.out.println("No está en el rango");
        } else if (puntuacion>=0 && puntuacion < 3){
            System.out.println("MD");
        }else if (puntuacion>=3 && puntuacion<5){
            System.out.println("INS");
        }else if (puntuacion == 5){
            System.out.println("SF");
        }else if (puntuacion == 6){
            System.out.println("BIEN");
        }else if (puntuacion>=7 && puntuacion <=8){
            System.out.println("NOT");
        }else if (puntuacion>=9 && puntuacion <= 10){
            System.out.println("SOB");
        }
    }
}