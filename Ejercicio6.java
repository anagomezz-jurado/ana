/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclefor;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, menor, mayor, i;
        
        System.out.println("Dime un número: ");
        num1 = sc.nextInt();
        
        System.out.println("Dime otro número: ");
        num2 = sc.nextInt();
        
        if (num1 < num2){
            menor = num1;
            mayor = num2;
        } else{
            menor = num2;
            mayor = num1;
        }
        
        
        System.out.println("Desde " + menor + " hasta " + mayor + ":");
        
        for (i = menor; i <= mayor; i++){
            System.out.println(i + " ");
        }
    }
  
}
