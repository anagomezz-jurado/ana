/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
9.- Realiza un método en Java para encontrar todos los números primos menores
que 100.
Salida esperada:
3,5,7,11,13,17,19,29,31,41,43,59,61,71,73

 */

public class Ejercicio9 {
    public static void main(String[] args) {
        sonPrimos();
    }
      
    static int sonPrimos(){
        for (int i = 2; i < 100; i++) {
            boolean esPrimo = true; //Creemos que el numero es primo
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { //Si es divisible por j no es primo
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + ",");
            }
        }
        return 0;
    }
   
}