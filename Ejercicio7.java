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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidad, menor, i, numero;
        
        System.out.println("Dime la cantidad de número que quieres introducir: ");
        cantidad = sc.nextInt();
        
        System.out.println("Introduce el primer numero:");
        menor = sc.nextInt();
        
        for (i = 1; i <= cantidad; i++){
            System.out.print("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            
            
            if (numero < menor){
                menor = numero;
            }
        }
        
        System.out.println("El número menor introducido es: "+ menor);
        
        sc.close();
    }
}
