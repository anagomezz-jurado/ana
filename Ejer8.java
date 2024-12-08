/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerifswitch;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int hora;
        
        System.out.print("Dime un hora: ");
        hora = sc.nextInt();
        
        if (hora>=6 && hora<=12){
            System.out.println("Buenos días");
        }else if (hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        }else{
            System.out.println("Buenas noches");
        }
        
    }
}
