/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Random;

/**
 *
 * @author anago
 */
public class JugandoConArrays {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 6, 78, 12, 34};
        
        System.out.println("posicion 3: " + numeros[3]);
        System.out.printf("Mi array tiene: %d posiciones%n", numeros.length);
        
        //Recorrer el array. Forma clásica: Con for
        for(int i = 0; i <numeros.length; i++){
            System.out.println(" ->" + numeros[i]);
        }
            
        //Recorrer el array. Forma nueva: Con un for-each
        for (int numero : numeros) {
            System.out.println("=> " + numero);
            
        }
        
        //Array de cadena
        String[] nombres = {"Juan", "Pedro", "Antonio", "Federico", "Alejandro"};
        
        //Imprimir el arraay de una cadena, en este caso los nombre de la lista nombres
        for (String nombre : nombres) {
            System.out.printf("Nombre %s%n", nombre);
            
        }
        
        //Mostrar nombres al reves
        for(int i = nombres.length - 1; i >= 0; i--){
            System.out.printf("Nombre del reves %s%n", nombres[i]);
        }
        
        
        //Rellenas Array
        int[] aleatorios = new int[20];
        
        Random r = new Random();
        
        /* for (int aleatorio : aleatorios) {
            aleatorio = r.nextInt(11);
            System.out.println("-> " + aleatorio );
        }**/
        
       
        for(int i = 0; i < aleatorios.length; i++){
            aleatorios[i] = r.nextInt(11);
        }
        
        for (int aleatorio : aleatorios) {
            System.out.println("-> " + aleatorio);
        }
    }
}
