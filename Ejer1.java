package ejerifswitch;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anago
 */
public class Ejer1 {
    public static void main(String[] args) {
        int num1, num2, mayor;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        
        
        //Libero buffer
        sc.nextLine();
                
        if (num1 > num2){
            mayor = num1;
        } else{
            mayor = num2;
        }
        
        //mayor=(num1>num2)?num1:num2; (lo mismo que el if)OPERADOR TERCIARIO
        
        System.out.println("El mayor es: "+mayor);
        
        sc.close();
    }
}
