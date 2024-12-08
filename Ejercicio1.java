/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

/**
Escribir una función llamada redondear tal que acepte como parámetros un
número real y un número entero, siendo el primero de ellos el que debe
redondear, según se intuye en el nombre de la función. La función devolverá el
número redondeando la cantidad de posiciones decimales que establezca el
parámetro entero a través del propio parámetro real, es decir, cuando
realicemos la llamada: redondear (numero, posiciones); será en el número
donde se almacene el resultado.
Ejemplo: redondear(2.3658,2) → 2,37
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Solución: " + redondear(2.3658, 2));
    }

    static double redondear(double numero, int posicion) {
        
        double parteDecimal = numero - (int) numero; //se obtiene la parte decimal del número
        
        // Multiplica la parte decimal por 10 para mover la primera cifra decimal
        double parteDecimalMultiplicada = parteDecimal;
        for (int i = 0; i < posicion; i++) {
            parteDecimalMultiplicada *= 10; // Desplaza la parte decimal a la derecha
        }
        
        // Se calcula el redondeo mirando la parte entera de la multiplicación
        double redondeo = parteDecimalMultiplicada - (int) parteDecimalMultiplicada;
        
        // Si el valor de la parte decimal redondeada es 0.5 o mayor, se incrementa
        if (redondeo >= 0.5) {
            parteDecimalMultiplicada++; //Realiza el redondeo
        }
        
        // Se obtiene el valor entero de la parte decimal redondeada
        double nuevosDecimales = (int) parteDecimalMultiplicada;
        
        // Se mueve de nuevo la parte decimal redondeada a su posición original
        for (int i = 0; i < posicion; i++) {
            nuevosDecimales /= 10; // Desplaza la parte decimal de vuelta a su lugar
        }
        // Se suma la parte entera original con los nuevos decimales redondeados
        return (double) ((int) numero) + nuevosDecimales;

    }
    
}