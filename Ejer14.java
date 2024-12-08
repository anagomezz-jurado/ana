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
public class Ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double precio = 8.0;
        final double precioMiercoles = 5.0;
        final double precioJuevesDos = 11.0;
        final double descuentoTarjeta = 0.10;

        System.out.print("Introduce el número de entradas: ");
        int numeroEntradas = sc.nextInt();

        System.out.print("Introduce el día de la semana: ");
        String dia = sc.next().toLowerCase();

        System.out.print("¿Tienes tarjeta CinesTrassierra? (s/n): ");
        char tieneTarjeta = sc.next().toLowerCase().charAt(0);
        
        double precioTotal = 0.0;

        switch (dia) {
            case "miércoles":
                precioTotal = numeroEntradas * precioMiercoles;
                break;
            case "jueves":
                int parejas = numeroEntradas / 2;
                int individuales = numeroEntradas % 2;

                precioTotal = (parejas * precioJuevesDos) + (individuales * precio);
                break;
            case "lunes":
            case "martes":
            case "viernes":
            case "sábado":
            case "domingo":
                precioTotal = numeroEntradas * precio;
                break;
            default:
                System.out.println("Día de la semana no válido.");
                sc.close();
                return;
        }

        if (tieneTarjeta == 's') {
            double descuento = precioTotal * descuentoTarjeta;
            precioTotal = precioTotal - descuento;
                   
        }

        System.out.printf("El precio total a pagar es: " +precioTotal+ " €");
        
        sc.close();
    }
}
