/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

/**
 *
 * @author anago
 */
public class Ejer12 {
    public static void main(String[] args) {
        int PROBLEMASPORSEMANA = 2;
        int NSEMANAS = 6;
        int erroresTotales = 0;
        
        for (int i=0; i<PROBLEMASPORSEMANA*NSEMANAS; i++){
            System.out.println("Errores totales: "+ erroresTotales);
            erroresTotales += Math.pow(2,i);
        }
        
        System.out.println("El número de errores totales es: "+erroresTotales);
    }
}