/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
Realiza una función recursiva que pida al usuario la posición del número de la
serie de fibonacci que se quiere que se imprima, ejemplo, la serie es:
1,1,2,3,5,8,13,21..si quiero imprimir la posición 4 saldrá el número 3, si pongo la
posición 5 saldrá el número 5. Habrá que tener en cuenta que:
a. Fibonacci(n)= Fibonacci (n-1) + Fibonacci (n-2)
b. Fibonacci(0)=1
c. Fibonacci(1)=1

 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicion;

        System.out.println("¿Qué posicion de la serie de Fibonnaci quieres mostrar? ");
        posicion = sc.nextInt();

        System.out.printf("La posicion %d de Fibonnaci es el número %d \n", posicion, fibonnacci(posicion));
        System.out.printf("La posicion %d de Fibonnaci es el número %d \n", posicion, fibonnacciR(posicion));

    }

     static int fibonnacci(int posicion) {
        int n0, n1, nx = 0;

        n0 = 1;
        n1 = 0;

        if (posicion == 0) {
            return n0;
        }
        if (posicion == 1) {
            return n1;
        }

        for (int i = 2; i <= posicion; i++) {
            nx = n0 + n1;
            n0 = n1;
            n1 = nx;
        }
        return nx;

    

    }
    
    
    static int fibonnacciR(int posicion) {
        if (posicion == 0 || posicion == 1) {
            return 1;
        }
        return fibonnacciR(posicion - 1) + fibonnacciR(posicion - 2);

    }

}
