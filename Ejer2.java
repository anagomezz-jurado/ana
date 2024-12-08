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
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int promedio, contador = 0, suma = 0, mayorEdad = 0;
        
        for (int i = 1; i <= 50; i++){
            System.out.print("Dime el nombre del estudiante: ");
            String nombre = sc.nextLine();
            
            System.out.print("Dime la edad del estudiante: ");
            int edad = sc.nextInt();
            
            //Liberar buffer
            sc.nextLine();
            
            contador ++;
            suma += edad;
            
            
        
        }
        promedio = suma / contador;
        
        System.out.println("El promedio de la edad es "+promedio);
    }
}
