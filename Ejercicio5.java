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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, numeroSiguiente, suma;
        
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        while (numero != 0){
            System.out.print("Introduce otro número (0 para salir): ");
            numeroSiguiente = sc.nextInt();
            
            if (numeroSiguiente == 0){
                break;
            }
            
            suma = numero + numeroSiguiente;
            System.out.println("Suma de " + numero + " + " + numeroSiguiente + " = " + suma);
            numero = numeroSiguiente;
        }
        
    }
}
