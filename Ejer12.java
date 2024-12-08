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
public class Ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        num3 = sc.nextInt();
        
        
        //Libero buffer
        sc.nextLine();
                
        if (num1 > num2 && num1>num3){
            if (num2 > num3){
                    System.out.println(num1+"  mayor que "+num2+ " mayor que "+num3);}
            else{
            System.out.println(num1+"  mayor que "+num3+ " mayor que "+num2);}
        } else if (num2> num1 && num2>num3){
            if (num1 > num3){
                    System.out.println(num2+"  mayor que "+num1+ " mayor que "+num3);}
            else{
            System.out.println(num2+"  mayor que "+num3+ " mayor que "+num1);}
        } else if (num3> num1 && num3>num2){
            if (num1 > num2){
                    System.out.println(num3+"  mayor que "+num1+ " mayor que "+num2);}
            else{
            System.out.println(num3+"  mayor que "+num2+ " mayor que "+num1);}
        
        //mayor=(num1>num2)?num1:num2; (lo mismo que el if)OPERADOR TERCIARIO
        
        }
        sc.close();
    }
}
