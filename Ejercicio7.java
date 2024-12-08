/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
7.- Realiza un método en Java para verificar si un año (entero) introducido por el
usuario es o no un año bisiesto.
Salida esperada:
Introduce el año: 2017
falso

 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int año = 0;
        
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        
        
        System.out.println(bisiesto(año));
    }
    
    static boolean bisiesto(int año){
     return  (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
    }
    
     /*
        boolean bisiesto;
        if ((aÃ±o%4==0 && !(aÃ±o%100 == 0)) || (aÃ±o%400==0)){
            bisiesto = true;
        }else{
            bisiesto = false;
        }
        return bisiesto;
        */
}
