/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
20. Realiza un programa que dado un número real separe su parte entera de su parte
decimal devolviendo dos números enteros. Pide el número en el main y llama a
una función que muestre el resultado.
Ahora modifica esta misma función para que muestre el resultado en el main.
Para ello deberás devolver 2 datos a la función principal, uno de ellos con el
return y otro con el out.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un número: ");
        double numero = sc.nextDouble();
        
        System.out.print("El resultado es: " + numeroReal(numero));
    }
    
    static int numeroReal(double numero){

        int parteEntera = (int) numero;
        int parteDecimal = (int) (numero - parteEntera) * 100;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
        return 0;
    }
}
