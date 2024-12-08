/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 * 15. Crea una variante del ejercicio 13, para ello al iniciar el programa se
 * insertarán en el vector los 15 datos de enteros (como ya se hacía en el
 * ejercicio13), luego deberá mostrar un MENÚ con las siguientes opciones: 1.
 * Insertar un elemento en una posición del vector 2. Buscar producto (ya estaba
 * hecho en el ejercicio 13) 3. Listar producto 4. Salir. En la función de
 * insertar tendrás que tener en cuenta que perderás el último dato y tendrás
 * que deslizar los datos a partir del insertado.
 */
public class Ejercicio15 {

    static Scanner sc = new Scanner(System.in);
    final static int TAM_MAXIMO = 15;

    public static void main(String[] args) {

        int[] numeros = new int[TAM_MAXIMO];
        int opcion;
        inicializarVector(numeros);
        
        
        do {
            menu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    insertarElemento(numeros);
                    break;
                case 2:
                    buscarElemento(numeros);
                    break;
                case 3:
                    listarElemento(numeros);
                    break;
                case 4:
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

    }

    static void menu() {
        System.out.println("""
                           
            1. Insertar un elemento en una posición del vector
            2. Buscar producto 
            3. Listar producto
            4. Salir
                           """);
    }
    
    static void inicializarVector(int[] numeros) {
         for (int i = 0; i < TAM_MAXIMO; i++) {
            System.out.printf("Dime el número", i);
            numeros[i] = sc.nextInt();
        }
    }
    
    static void insertarElemento(int[] numeros) {
      System.out.print("Introduce el número a insertar: ");
        int nuevoNumero = sc.nextInt();

        System.out.print("Introduce la posición (0 a " + (TAM_MAXIMO - 1) + "): ");
        int posicion = sc.nextInt();

        if (posicion < 0 || posicion >= TAM_MAXIMO) {
            System.out.println("Posición inválida.");
            return;
        }

        // Desplazar elementos hacia la derecha desde la posición indicada
        for (int i = TAM_MAXIMO - 1; i > posicion; i--) {
            numeros[i] = numeros[i - 1];
        }

        // Insertar el nuevo número en la posición
        numeros[posicion] = nuevoNumero;

        System.out.println("Número insertado correctamente.");
    }

    static void buscarElemento(int[] numeros) {
        System.out.print("Dime el numero que quieres buscar: ");
        int numeroEncontrado = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < TAM_MAXIMO; i++) {
            if (numeros[i] == numeroEncontrado) {
                System.out.println("Número encontrado en la posicion: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número no se ha encontrado.");
        }

    }

    static void listarElemento(int[] numeros) {
        System.out.println("Elementos del vector:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
