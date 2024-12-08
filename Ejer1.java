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
public class Ejer1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, cantidad, menor = 0, i;
        int promedio = 0;
        int contadorPositivo = 0, sumaPositivo = 0;

        do {
            System.out.println("Dime un número");
            numero = sc.nextInt();

            //NUMERO MAYOR        
            
             if (numero < menor) {
                    menor = numero;
                }
           

            //NEGATIVOS
            if (numero < 0) {
                System.out.println("Hay números negativos");
            }

            //PROMEDIO 
            if (numero >= 0) {
                contadorPositivo++;
                sumaPositivo += numero;
            }
            promedio = sumaPositivo / contadorPositivo;

        } while (numero != 0);
        System.out.println("El numero menor introducido es: " + menor);
        System.out.println("El promedio de los numeros positivos son:  " + promedio);

    }

}
