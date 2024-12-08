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
public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float nota1, nota2, nota3, suma, resultado;
        
        System.out.print("Dime la primera nota");
        nota1 = sc.nextFloat();
        
        System.out.print("Dime la segunda nota");
        nota2 = sc.nextFloat();
        
        System.out.print("Dime la tercera nota");
        nota3 = sc.nextFloat();
        
        
        //Limpiamos buffer
        sc.nextLine();
        
        suma = nota1 + nota2 + nota3;
        resultado = suma / 3;
        
        
        if (resultado <= 4){
            System.out.println("Insuficiente");
        } else if (resultado == 5){
            System.out.println("Suficiente");
        } else if (resultado==6){
            System.out.println("Bien");
        } else if (resultado>=7 && resultado<=8){
            System.out.println("Notable");
        } else if (resultado>=9 && resultado<=10){
            System.out.println("Sobresaliente");
        }
    }
}
