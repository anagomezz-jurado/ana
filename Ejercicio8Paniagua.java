/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejercicio8Paniagua {
final static int MAXIMO = 100;
    
    public static void main(String[] args) {
    
    String[] nombres = new String[MAXIMO];
    Scanner sc = new Scanner(System.in);
    String nuevo;
    do{
        System.out.print("Introduzca un nombre (vacío para salir) ");
        nuevo=sc.nextLine();
        insertar(nombres, nuevo);
        
    }while(!nuevo.isEmpty());
      
    listar(nombres);
    
    }

    
    private static void listar(String[] nombres) {
        System.out.println("--- Lista de nombre ---");
        for (String nombre : nombres) {
            System.out.printf("-%s%n",nombre);
        }
        System.out.println("--- FIN DEL LISTADO ---");
    }

    private static void insertar(String[] nombres, String nuevo) {
        if (!nuevo.isEmpty()){
         int contador = 0;
         while(nombres[contador]!= null && contador < MAXIMO){
             contador++;
         }
         nombres[contador] = nuevo;
         
        }
        
    }
    


}
