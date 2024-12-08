/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
 * 18.- Este colegio tiene almacenados los nombres de los estudiantes en el
 * array NOMBRES [15]. Los nombres de las materias en el array ASIGNATURAS [4] y
 * la calificación de cada estudiante en cada curso en el array CALIFICACIONES
 * [4] [15]. Realiza una aplicación que muestre la calificación de cada alumno
 * en cada curso. El programa también debe mostrar el promedio de cada
 * estudiante.
 *
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NOMBRES = {"Ana Gómez", "Lucía Morales", "Rubén Roldán",
            "Alejandro Beato", "Juan Idelfonso", "Conchi Reyes", "Miguel Cotta",
            "Juan Dadiv Casas", "Alejandra Arcila", "Francisco Javier Cano", "José René Amador",
            "Alejandro Casado", "Jose Luis Franco", "Jose Luis Fuentes", "Antonio Malagon"};

        String[] ASIGNATURAS = {"Programacion", "Base de datos", "Sistemas Informáticos",
            "Lenguaje de Marcas"};

        double[][] CALIFICACIONES = {{6, 7, 8, 9}, {10, 7, 6, 7}, {8, 8, 6, 7}, {4, 3, 8, 4}, {5, 6, 6, 7},
        {7, 8, 8, 9}, {9, 4, 5, 6}, {7, 2, 2, 4}, {5, 5, 6, 7}, {7, 8, 5, 4}, {3, 9, 8, 7}, {6, 3, 4, 5}, {6, 7, 8, 9},
        {6, 6, 9, 9}, {3, 2, 1, 2}};

        String mejorAlumno = "";
        double mejorPromedio = 0;

        String mejorAsignatura = "";
        double mejorPromedioAsignatura = 0;

        for (int i = 0; i < NOMBRES.length; i++) {
            System.out.println(" ");
            System.out.println("Estudiante: " + NOMBRES[i]);
            double suma = 0;
            for (int j = 0; j < ASIGNATURAS.length; j++) {
                System.out.println(" " + ASIGNATURAS[j] + " : " + CALIFICACIONES[i][j]);
                suma += CALIFICACIONES[i][j];
            }
            double promedio = suma / ASIGNATURAS.length;
            System.out.println("El promedio del estudiante es: " + promedio);
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = NOMBRES[i];
            }
        }
        
        //Alumno con el mejor promedio
        System.out.println("\nEl alumno con el mejor promedio es " + mejorAlumno + " con una media de: " + mejorPromedio);

        //Asignatura mas alta
        for (int j = 0; j < ASIGNATURAS.length; j++) {
            double sumaAsignatura = 0;
            for (int i = 0; i < NOMBRES.length; i++) {
                sumaAsignatura += CALIFICACIONES[i][j];
            }

            double promedioAsignatura = sumaAsignatura / NOMBRES.length;
            if (promedioAsignatura > mejorPromedioAsignatura) {
                mejorPromedioAsignatura = promedioAsignatura;
                mejorAsignatura = ASIGNATURAS[j];
            }
        }
        System.out.println("\nLa asignatura con el mejor promedio es " + mejorAsignatura + " con una media de: " + mejorPromedioAsignatura);

    }
}
