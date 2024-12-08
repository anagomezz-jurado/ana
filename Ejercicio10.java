/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
10. Crea una función llamada "Signo", que reciba un número real, y devuelva un
número entero con el valor: -1 si el número es negativo, 1 si es positivo o 0 si es
cero
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numero;
        System.out.print("Dime un numero: ");
        numero = sc.nextInt();
        
        Signo(numero);
    }
    
    static int Signo(double numero){
        if(numero < 0){
            System.out.println("-1");
        } else if (numero > 0){
            System.out.println("1");
        } else if (numero == 0){
            System.out.println("0");
        }
        return 0;
    }
}
