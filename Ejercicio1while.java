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
public class Ejercicio1while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        long resultado = 1;

        System.out.println("¿De que número quieres calcular el factorial?: ");
        numero = sc.nextInt();
        
        while (numero>1){
            resultado *= numero;
            //numero = numero -1;
            numero--;
        }
    }
}
