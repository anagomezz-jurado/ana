package Arrays.dos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jlcamunas
 */
public class BuscaDaniel {

    //Constantes
    static final int FILAS = 6; //De la A a la E
    static final int COLUMNAS = 5;
    static final int BOMBAS = 3;

    //C?digos de celdas
    static final int VACIO_SIN_VISITAR = 0;
    static final int VACIO_VISITADO = 1;
    static final int CERCA_DANI_SIN_VISITAR = 2;
    static final int CERCA_DANI_VISITADO = 3;
    static final int BOMBA = 4;
    static final int DANI = 5;

    //C?digos de color
    static final String BLACK = "\u001B[30m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String BLUE = "\u001B[34m";
    static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        //Tablero de juego
        int[][] tablero = new int[FILAS][COLUMNAS];

        //Iniciamos el tablero        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = VACIO_SIN_VISITAR;
            }
        }

        //Insertamos las bombas
        int filaBomba, columnaBomba;
        int contador = 0;
        while (contador < BOMBAS) {
            filaBomba = random.nextInt(FILAS);
            columnaBomba = random.nextInt(COLUMNAS);
            if (tablero[filaBomba][columnaBomba] == VACIO_SIN_VISITAR) { //Si una celda está vacía (VACIO_SIN_VISITAR), se coloca una bomba en esa posición.
                tablero[filaBomba][columnaBomba] = BOMBA;
                contador++;
            }
        }

        //Insertamos a Dani
        int filaDani = random.nextInt(FILAS);
        int columnaDani = random.nextInt(COLUMNAS);
        contador = 0;
        while (contador < 1) {
            if (tablero[filaDani][columnaDani] == VACIO_SIN_VISITAR) { //Se coloca "Dani" en una celda vacía aleatoria. Se asegura de que no se coloque sobre una bomba.
                tablero[filaDani][columnaDani] = DANI;
                contador++;
            }
        }

        //Insertamos los cerca de Dani
        //Fila superior
        for (int i = filaDani - 1; i <= filaDani + 1; i++) {
            for (int j = columnaDani - 1; j <= columnaDani + 1; j++) {
                if (i >= 0 && i < FILAS && j >= 0 && j < COLUMNAS) {
                    if (tablero[i][j] == VACIO_SIN_VISITAR) {
                        tablero[i][j] = CERCA_DANI_SIN_VISITAR;
                    }
                    
                    
/* Las celdas adyacentes a "Dani" (es decir, las celdas en las 
filas y columnas cercanas a donde está "Dani") se marcan 
como CERCA_DANI_SIN_VISITAR, indicando que están cerca de "Dani".*/
                }
            }
        }
        
        //Bucle para el juego
        int fila, columna;
        String column;
        do {
            pintaTablero(tablero); //Se muestra el tablero actualizado (a través de la función pintaTablero).

            System.out.printf("Introduce una fila entre 1 y %d\n", FILAS);
            fila = sc.nextInt();
            sc.nextLine();

            System.out.println("Introduce una columna entre A y E");
            column = sc.nextLine();
            columna = column.toUpperCase().charAt(0) - 'A';

            System.out.println("Has elegido: " + fila-- + "," + column.toUpperCase());

            switch (tablero[fila][columna]) {
                case VACIO_SIN_VISITAR:
                    System.out.println("NADA");
                    tablero[fila][columna] = VACIO_VISITADO;
                    break;
                case VACIO_VISITADO:
                    System.out.println("YA HAS VISITADO ESTA CASILLA");
                    break;
                case CERCA_DANI_SIN_VISITAR:
                    System.out.println("CERCA DE DANI");
                    tablero[fila][columna] = CERCA_DANI_VISITADO;
                    break;
                case CERCA_DANI_VISITADO:
                    System.out.println("YA HAS VISITADO ESTA CASILLA");
                    System.out.println("CERCA DE DANI");
                    break;
                case BOMBA:
                    System.out.println("BOMBA!!! LO SIENTO HAS PERDIDO");
                    pintaTableroCompleto(tablero);
                    break;
                case DANI:
                    System.out.println("ENHORABUENA!!! HAS ENCONTRADO A DANI");
                    pintaTableroCompleto(tablero);
                    break;
                default:
                    break;
            }

        } while (tablero[fila][columna] != BOMBA && tablero[fila][columna] != DANI);
    }

    public static void pintaTablero(int[][] tablero) {
/*
        pintaTablero: Muestra el tablero con los estados actuales de las 
        casillas que el jugador ha visitado, 
        como las celdas vacías visitadas y las cercanas a "Dani".
        */
        System.out.printf("  %3s %3s %3s %3s %3s\n", "A", "B", "C", "D", "E");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tablero[0].length; j++) {

                switch (tablero[i][j]) {
                    case VACIO_VISITADO:
                        System.out.printf("| " + PURPLE + "-" + BLACK + " ");
                        break;
                    case CERCA_DANI_VISITADO:
                        System.out.printf("| " + GREEN + "!" + BLACK + " ");
                        break;
                    default:
                        System.out.printf("|   ");
                        break;
                }
            }
            System.out.println("|");
        }
    }

    public static void pintaTableroCompleto(int[][] tablero) {
/*      pintaTableroCompleto: Muestra el tablero completo, revelando las 
        bombas, "Dani", y las celdas cercanas a "Dani", 
        para que el jugador vea el resultado final del juego.*/
        System.out.printf("  %3s %3s %3s %3s %3s\n", "A", "B", "C", "D", "E");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tablero[0].length; j++) {

                switch (tablero[i][j]) {
                    case VACIO_VISITADO:
                        System.out.printf("| " + PURPLE + "-" + BLACK + " ");
                        break;
                    case CERCA_DANI_VISITADO:
                        System.out.printf("| " + GREEN + "!" + BLACK + " ");
                        break;
                    case BOMBA:
                        System.out.printf("| " + RED + "X" + BLACK + " ");
                        break;
                    case DANI:
                        System.out.printf("| " + BLUE + "O" + BLACK + " ");
                        ;
                        break;
                    default:
                        System.out.printf("|   ");
                        break;
                }
            }
            System.out.println("|");
        } } 
}
