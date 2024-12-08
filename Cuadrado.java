/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author anago
 */
public class Cuadrado {
    /*
    TODOS LOS OBJETOS HEREDAN DE Object
      Object ob = new Object();
    */
    /*
        MAS IMPORTRANTES
        equals(Object) ---- para comaparar objetos
        toString() ---- mi objeto me devuelve un descriptor, en cadena 
        notify() ---- para programar en hilos
        )
        */
    
    int lado;
    
    public Cuadrado(int ladoNuevo){
        this.lado=ladoNuevo;
    }
    
    public Cuadrado(){
        this.lado = 10;
    }
    
    @Override //Sobreescribir
    public String toString(){
        return "Cuadrado de "+this.lado + " de lados";
    }
    
    @Override //Sobreescribir
    public boolean equals(Object obj){ //Comparar un cuadrado con otro
        return ((Cuadrado) obj).lado == this.lado; //Dos cuadrados son iguales si el aldo es igual
    }
    
    public void dibujar(){ //Dibujar cuadrado con asteriscos
        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0 || i == this.lado-1 || j==0 || j == this.lado -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}
