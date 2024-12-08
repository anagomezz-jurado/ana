/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejer10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int puntuacionActual, resultado, puntuacionMinima = 0, puntuacionMaxima = 0, suma = 0, puntuacion, contador = 0, contadorSus = 0, contadorApro = 0, contadorSigni = 0, contadorSobre = 0;

        do {
            System.out.print("Dime el nombre del estudiante: ");
            nombre = sc.nextLine();

            System.out.print("Dime la puntuación en SPL: ");
            puntuacion = sc.nextInt();
            contador ++;
            
            //LIBERAR BUFFER
            sc.nextLine();
            
            if (puntuacion < 5) {
                contadorSus++;
            } else if (puntuacion >= 5 && puntuacion < 7) {
                contadorApro++;
            } else if (puntuacion >= 7 && puntuacion < 8.5) {
                contadorSigni++;
            } else if (puntuacion >= 8.5 && puntuacion <= 10) {
                contadorSobre++;
            }
        } while (!nombre.equals("*"));

        for (int i = 0; i < contador; i++){
            puntuacionActual = puntuacion;
            suma += puntuacionActual;
            
            if (puntuacionActual > puntuacionMaxima){
                puntuacionMaxima = puntuacionActual;
            }
            if (puntuacionActual < puntuacionMinima){
                puntuacionMinima = puntuacionActual;
            }
        }
        
        resultado = suma / contador;
        
        System.out.println("La cantiad de estudantes suspensos son " + contadorSus);
        System.out.println("La cantiad de estudantes aprobados son " + contadorApro);
        System.out.println("La cantiad de estudantes significativos son " + contadorSigni);
        System.out.println("La cantiad de estudantes sobresalientes son " + contadorSobre);
        System.out.println("Estudiante con la puntuacion mas alta: " +puntuacionMaxima);
        System.out.println("Estudiante con la puntuacion mas baja: " +puntuacionMinima);
        System.out.println("Puntuaacion promedio de todos los estudiantes: " +resultado);
    }
}
