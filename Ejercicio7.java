/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 * 7. Crea una aplicación que mantendrá los precios de los productos de una
 * tienda de barrio. El programa debe mostrar el siguiente menú: 1.Nuevo
 * producto 2.Precio medio 3.Listar productos 4.Salir Se tendrá que crear una
 * función para visualizar el menú(), otra para insertarProd(), otra para
 * realizar el promedio() y una última para listarProd().
 */
public class Ejercicio7 {
        static double [] precios = {0,0f};
        static String[] productos = {};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            menu();
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    insertarProd();
                    break;
                case 2:
                    promedio();
                    break;
                case 3:
                    listarProd();
                    break;
                case 4:
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("La opcion no  es correcta");
            }
        } while (opcion != 4);

    }

    static void menu() {
        System.out.println("");
        System.out.println("MENÚ");
        System.out.println("1.Nuevo producto");
        System.out.println("2.Precio medio");
        System.out.println("3.Listar productos");
        System.out.println("4.Salir");
        System.out.println("");
    }

    static String[] insertarProd() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); 
        
        System.out.print("Dime el nombre del producto: ");
        String producto = sc.nextLine();
        System.out.print("Dime el precio del producto: ");
        int precio = sc.nextInt();

       
            return null;
    }

    static void promedio() {
        float suma = 0;
        for (double precio : precios) {
            suma += precio;
        }
        
        double promedio = suma / precios.length;
        System.out.println("La media de los pructos es: " + promedio);
    }

    static void listarProd() {
        
        System.out.println("-----------------------------------");
        System.out.printf("|%-25s|8s|%n", "PRODUCTOS", "PRECIOS");
        System.out.println("-----------------------------------");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("El producto " + productos[i] + " cuesta " + precios[i] + " euros");
        }
    }
}
