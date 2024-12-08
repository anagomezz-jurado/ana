/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 * 12. Modifica el ejercicio7 para que el menú te deje realizar las siguientes
 * operaciones: 1.Nuevo producto 2.Precio medio 3.Listar productos 4.Modificar
 * producto 5.Eliminar producto 6.Buscar producto. 7.Salir
 */
public class Ejercicio12 {

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
                    System.out.println("Modificar producto");
                    break;
                case 5:
                    System.out.println("Eliminar producto");
                    eliminarProducto();
                    break;
                case 6:
                    System.out.println("Buscar producto");
                    if (buscarProducto() != -1) {
                        System.out.println(" No se encuentra");
                    } else {
                        System.out.println("Lo tenemos.");
                    }
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);
    }

    public static void menu() {
        System.out.println("""
                             ==========Menu=========
                            1.- Nuevo producto
                            2.- Precio medio
                            3.- Listar productos
                            4.- Modificar productos
                            5.- Eliminar Prodcutos
                            6.- Buscar productos
                            7.- Salir
                           """);

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
        for (int i = 0; i < precios.length - 1; i++) {
            acum += precios[i];
        }
        System.out.printf("El precio medio es:  %.2f? \n", acum / (productos.length - 1));

    }

    public static void listarProd() {

        System.out.println("------------------------------------");
        System.out.printf("|%-25s|%8s|%n", "PRODUCTOS", "PRECIOS");
        System.out.println("------------------------------------");
        for (int i = 0; i < productos.length - 1; i++) {
            System.out.printf("|%d.-%-22s|%7.2f?|%n", i + 1, productos[i], precios[i]);
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

    private static int buscarProducto() {

        System.out.println("Introduzca nuevo producto");
        String pedido = scanner.nextLine();

        int posicion = 0;
        boolean encontrado = false;

        while (!encontrado && posicion < productos.length - 1) {
            if (productos[posicion].equalsIgnoreCase(pedido)) {
                encontrado = true;
            } else {
                posicion++;
            }
        }

        return encontrado ? posicion : -1;

    }

    private static int buscarProducto(String pedido) {

        int posicion = 0;
        boolean encontrado = false;

        while (!encontrado && posicion < productos.length - 1) {
            if (productos[posicion].equalsIgnoreCase(pedido)) {
                encontrado = true;
            } else {
                posicion++;
            }
        }

        return encontrado ? posicion : -1;

    }

    private static void eliminarProducto() {
        System.out.println("Introduzca producto a eliminar");
        String pedido = scanner.nextLine();
        int posicion = buscarProducto(pedido);
        String[] auxProductos = new String[productos.length - 1];
        double[] auxPrecios = new double[precios.length - 1];

        if (posicion == -1) {
            System.out.println("Producto no encontrado");
        } else {
            int contadorAux = 0;
            for (int i = 0; i < productos.length; i++) {
                if (posicion != i) {
                    auxProductos[contadorAux] = productos[i];
                    auxPrecios[contadorAux] = precios[i];
                    contadorAux++;
                }
            }

        }

        productos = auxProductos;
        precios = auxPrecios;
    }

}
