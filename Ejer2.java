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
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Dime un número: ");
        num = sc.nextInt();
        
        //Libero buffer
        sc.nextLine();
                        
        if (num % 2==0){
            System.out.println("El número es par");
        }
        else{
         System.out.println("El número es impar");
        }
    }
}
