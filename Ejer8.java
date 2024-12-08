/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

/**
 *
 * @author anago
 */
public class Ejer8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            int suma = 0;
            System.out.println("Divisores de: "+i);
            for (int j = i; j <= i/2; j++){
                if (i%j==0){
                    System.out.println(" "+j);
                    suma += j;
                }
                
            }
            if (suma == i){
                System.out.println("\n"+i + " ES PERFECTO");
            }
        }
    }
    
    
}
