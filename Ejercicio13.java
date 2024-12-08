/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
 * 13. Crea una función "PedirEntero", que reciba como parámetros el valor
 * mínimo aceptable y el valor máximo aceptable que se pide en el programa
 * principal. Deberá pedir al usuario que introduzca un valor dentro del rango
 * anterior, en caso de que el valor introducido no esté dentro del rango se lo
 * volverá a pedir hasta que sea correcto. Cuando esto suceda el mensaje de que
 * el valor está dentro del rango se imprimirá en la función principal.
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minimo, maximo;

        System.out.print("Dime el minimo aceptable: ");
        minimo = sc.nextInt();
        System.out.print("Dime el maximo aceptable: ");
        maximo = sc.nextInt();

        PedirEntero(minimo, maximo);
    }

    static int PedirEntero(int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.printf("Dime un valor entre %d y %d: ", minimo, maximo);
            valor = sc.nextInt();
        } while (valor < minimo || valor > maximo);
        System.out.println("El valor es correcto");
        return valor;
    }
}