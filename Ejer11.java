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
public class Ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hora, minutos, segundosPasados, segundosAlDia, segundosFaltan;
        
        System.out.print("Dime la hora: ");
        hora = sc.nextInt();
        
        System.out.print("Dime los minutos: ");
        minutos = sc.nextInt();
        
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59){
            System.out.println("La hora que has introducido no vale");
        } else{
            segundosPasados = (hora * 3600) + (minutos * 60);
            segundosAlDia = 24 * 3600;
            segundosFaltan = segundosAlDia - segundosPasados;            
            System.out.println("Faltan "+segundosFaltan+ " segundos para que sea medianoche");
        }
        
        sc.close();
    }
}
