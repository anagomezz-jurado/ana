/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author anago
 */
public class MultiplicacionRecursiva {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        
        System.out.printf("La multiplicacion de %d y de %d es %d", a, b, multiplicacion(a, b));
    }
    
    static int multiplicacion (int x , int y){
        if(x == 1){
            return y;
        }
        
        if (y == 1){
            return x;
        }
        return x + multiplicacion(x, y-1);
 
    }
   
}
