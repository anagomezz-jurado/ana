/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Random;

/**
 *
 * @author anago
 */

public class JugandoConRandom { //Ejemplos aleatorio
    
    public static void main(String[] args) {
        Random generador = new Random();
        System.out.println("Aleatorio entre 0 y 20 (el 20 no sale): " + generador.nextInt(20));
        //for (int i = 0; i < 1000; i++) {
          //  System.out.println("Aleatorio entre 0 y 20 (el 20 no sale)" + generador.nextInt(20));
        //}
        System.out.println("entre 0 y 1: "+ generador.nextDouble());
        
        System.out.println("Otra opción: " + Math.random());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(""+dameAleatorioEnUnRango(5, 15));
        }
    }
    
    static int dameAleatorioEnUnRango(int minimo, int maximo){
        int aleatorio = minimo + (int) (Math.random() * ((maximo-minimo)+1));
        
        return aleatorio;
    }
}