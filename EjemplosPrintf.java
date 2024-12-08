/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Date;

/**
 *
 * @author anago
 */
public class EjemplosPrintf {

    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 33;

        System.out.printf("Hola, %s. Tienes %d años.%n", nombre, edad);

        //Formateo cadenas simples
        String producto = "Camiseta";
        double precio = 36.98;
        String producto2 = "Pantalones";
        double precio2 = 145.2;
        System.out.printf("%-15s: €%.2f%n", producto, precio);
        System.out.printf("%-15s: €%.3f%n", producto, precio);
        System.out.printf("%-15s: €%.0f%n", producto, precio);
        System.out.printf("%-15s: €%.2f%n", producto2, precio2);
                
        //Redondeode número;
        double numero = 123.456789;
        System.out.printf("Número redondeado; %.2f %n ", numero);
        
        //Longitud y alineación de campos;
        String nombre1 = "María";
        String nombre2 = "Pedro";
        int edad1 = 30;
        int edad2 = 28;
        double peso1 = 65.3;
        double peso2 = 75.2;
        String formato = ("Nombre %-10s, Edad: %d, Peso: %.3f%n");
        System.out.printf(formato, nombre1, edad1, peso1);
        System.out.printf(formato, nombre2, edad2, peso2);
        
        //Formato de fecha y hora
        Date fecha = new Date();
        System.out.printf("Hoy es %tF %tT", fecha, fecha);
        
        
                
    }
}
