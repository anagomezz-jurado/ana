/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
Realizar un programa que permita calcular el área de diferentes figuras
geométricas de forma que muestre el siguiente menú:
a. Círculo.
b. Cuadrado.
c. Rectángulo
d. Triángulo
e. Salir
Se deben usar funciones, una para cada área y las constantes como PI. Recuerda
que:
• Área del círculo = PI * radio2
• Área del cuadrado = lado2
• Área del rectángulo = ancho x alto
• Área del triángulo = base * altura / 2
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcion = 0;

        do {
            System.out.println("a. Círculo");
            System.out.println("b. Cuadrado");
            System.out.println("c. Rectángulo");
            System.out.println("d. Triángulo");
            System.out.println("e. Salir");
            System.out.print("Dime una opcion");
            opcion = sc.nextLine().charAt(opcion);
            System.out.print(areas(opcion));
            System.out.println("");

            

        } while (opcion != 'e');

    }

    static int areas(int opcion) {
        Scanner sc = new Scanner(System.in);
        float resultado;

        switch (opcion) {
            case 'a':
                System.out.print("Dime el radio del círculo: ");
                int radio = sc.nextInt();
                resultado = (int) (Math.PI * radio * radio);
                System.out.print("El area del círculo es" + resultado);
                break;
            case 'b':
                System.out.print("Dime el lado del cuadrado: ");
                int lado = sc.nextInt();
                resultado = lado * lado;
                System.out.print("El area del cuadrado es" + resultado);
                break;
            case 'c':
                System.out.print("Dime el ancho del rectángulo: ");
                int ancho = sc.nextInt();
                System.out.print("Dime el alto del rectángulo: ");
                int alto = sc.nextInt();
                resultado = ancho * alto;
                System.out.print("El area del rectángulo es" + resultado);
                break;
            case 'd':
                System.out.print("Dime la base del triángulo: ");
                int base = sc.nextInt();
                System.out.print("Dime la altura del triángulo: ");
                int altura = sc.nextInt();
                resultado = base * altura / 2;
                System.out.print("El area del triángulo es" + resultado);
                break;
            default:
                System.out.print("OPCIÓN INVÁLIDA");
        }
        return 0;
    }

}
