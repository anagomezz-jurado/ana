/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclefor;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i;
        
        for (i = 0; i <= 100; i++){
            if (i % 5 == 0 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}
