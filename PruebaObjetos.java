/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author anago
 */
public class PruebaObjetos {
    public static void main(String[] args) {
        
        Cuadrado c1 = new Cuadrado();
        System.out.println(c1);
        c1.dibujar();
        Cuadrado c2 = new Cuadrado(5);
        Cuadrado c3 = new Cuadrado(10);
        
         System.out.println( "Cuadrado 2: " +c2);
         if (c2.equals(c3)){
             System.out.println("c2 es igual a c3");           
         }        
    }

}
