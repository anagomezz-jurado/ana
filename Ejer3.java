/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad, hombresMayores45 = 0, mujeresMayores45 = 0;
        String sexo ="";
        
        for (int i = 1; i <= 60; i++){
            
            do {                
                System.out.println("Dime la edad del profesor: ");
                edad = sc.nextInt();
                
                if (edad < 18 || edad > 70){
                    System.out.println("La edad no es válida tiene que estar entre 18 y 70");
                }
            } while (edad < 18 || edad > 70);
            
            do {
                System.out.println("Dime el sexo: ");
                sexo = sc.nextLine();
                if (!sexo.equals("M") && !sexo.equals("F")){
                    System.out.println("Sexo no válido. Tienes que poner F o M");
                }

            } while (!sexo.equals("M") && !sexo.equals("F"));
            
            
            if (edad > 45){
                if (sexo.equals("M")){
                    hombresMayores45++;
                } else if (sexo.equals("F")){
                    mujeresMayores45++;
                }
            }
        }
    }
}
