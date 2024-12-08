/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejercicio7B {
    static Scanner scanner = new Scanner(System.in);
    static String[] productos = new String[1];
    static double[] precios = {0.0f};

    public static void main(String[] args) {

        int opcion;
        do {
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();
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
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }

    public static void menu() {
        System.out.println("");
        System.out.println("==========Menu=========");
        System.out.println("1.- Nuevo producto");
        System.out.println("2.- Precio medio");
        System.out.println("3.- Listar productos");
        System.out.println("4.- Salir");
        System.out.println("");
        System.out.print("Introduzca opcion: ");
    }

    public static void insertarProd() {

        System.out.println("Introduzca nuevo producto");
        productos[productos.length - 1] = scanner.nextLine();
        do {
            System.out.println("Introduzca su precio");
            precios[precios.length - 1] = scanner.nextDouble();
        } while (precios[precios.length - 1] < 0);

        //Preparamos espacio para el siguiente producto
        productos = copiarProd(productos);
        precios = copiarPrec(precios);
    }

    public static void promedio() {
        float acum = 0;
        System.out.println("------------------------------------");
        for (int i = 0; i < precios.length-1; i++) {
            acum += precios[i];
        }
        System.out.printf("El precio medio es:  %.2f\n", acum / (productos.length-1));

    }

    public static void listarProd() {

        System.out.println("------------------------------------");
        System.out.printf("|%-25s|%8s|%n", "PRODUCTOS", "PRECIOS");
        System.out.println("------------------------------------");
        for (int i = 0; i < productos.length-1; i++) {
            System.out.printf("|%d.-%-22s|%7.2f|%n", i + 1, productos[i], precios[i]);
        }
    }

    public static String[] copiarProd(String[] productos) {
        String[] nuevoProductos = new String[productos.length + 1];
        for (int i = 0; i < productos.length; i++) {
            nuevoProductos[i] = productos[i];
        }
        return nuevoProductos;

    }

    public static double[] copiarPrec(double[] precios) {
        double[] nuevoPrecios = new double[precios.length + 1];
        System.arraycopy(precios, 0, nuevoPrecios, 0, precios.length);
        return nuevoPrecios;
    }
}
