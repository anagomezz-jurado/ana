/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

/**
 *
 * @author anago
 */
public class Ejer13 {
 public static void main(String[] args) {
        int suma = 0;
        int CANTIDAD = 100;
        boolean esPrimo = true;
        int divisor = 2;
        int contador = 0; //Números de primos encontrados
        int numero = 1;//Empiezo por uno
        
        while (contador < CANTIDAD){
            divisor = 2; //Los divisores
            
            while(esPrimo && (divisor <= Math.sqrt(numero))){
                if(numero % divisor == 0){
                    esPrimo = false;
                }
                divisor++;
            }
            if (esPrimo){
                System.out.println(contador + "-Primo: "+numero);
                suma += numero;
                contador++;
            }
            numero++;
            esPrimo = true;
        }
        
        System.out.println("La suma de los "+CANTIDAD+ " primeros primos es: " + suma);
 }
 }