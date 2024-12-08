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
public class Ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float operador1, operador2, resultado = 0;
        String operacion;

        System.out.print("Introduce el primer número: ");
        operador1 = sc.nextFloat();

        System.out.print("Introduce el segundo número: ");
        operador2 = sc.nextFloat();
        
        //Limpiamos buffer
        sc.nextLine();

        System.out.print("Introduce la operación: ");
        operacion = sc.nextLine();

        switch (operacion) {
            case "+":
                resultado = operador1 + operador2;
                break;
            case "-":
                resultado = operador1 - operador2;
                break;
            case "x":
                resultado = operador1 * operador2;
                break;
            case "/":
                resultado = operador1 / operador2;
                break;
                
            default:
                System.out.print("Operador no soportado");
        }

        System.out.print("El resultado es: "+resultado);
    }
}
