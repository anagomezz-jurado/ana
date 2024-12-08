/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclefor;

/**
 *
 * @author anago
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        int i, j;
        
        for (i = 1; i <= 10; i++){
            System.out.println("");
            System.out.println("Tabla del "+ i);
            System.out.println("*********");
            
            for (j = 1; j <= 10; j++){
                System.out.println( i + " x " + j + " = " + (i*j));
            }
        }
        
    }
}
