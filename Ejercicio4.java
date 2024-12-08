/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

/**
 *Crea una función llamada "BorrarPantalla", que borre la pantalla dibujando 25
líneas en blanco. 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        BorrarPantalla();
    }
    
    static void BorrarPantalla(){
        for(int i = 1; i <= 25; i++){
            System.out.println("");
        }
    }
}