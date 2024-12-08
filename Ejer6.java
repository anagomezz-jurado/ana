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
public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, mayor;

        System.out.println("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        
        
        //Libero buffer
        sc.nextLine();
                
        if (num1==num2){
            System.out.println("SON IGUALES");
        } else if (num1 > num2){
            mayor = num1;
            System.out.println("El número mayor es: "+mayor);
        } 
        else{
            mayor = num2;
            System.out.println("El número mayor es: "+mayor);

        }
        
        //mayor=(num1>num2)?num1:num2; (lo mismo que el if)OPERADOR TERCIARIO
                
        sc.close();
    }
}
