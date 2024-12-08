/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author anago
 */
public class SumaRecursiva {
    public static void main(String[] args) {
        int a  = 5;
        int b = 6;
        
        System.out.printf("La suma  de %d  y de %d es %d",a, b, suma(a,b));
    }
    
    
    static int suma (int x , int y){
        if(x == 0){
            return y;
        } 
        
        if (y == 0){
            return x;
        }
        return 1 + suma(x, y-1);
    }
}
