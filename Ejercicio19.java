/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.ejercicios2;

import java.util.Scanner;

/**
19. Realiza un programa que muestre por pantalla la fecha del día siguiente al que
se especifica. Para ello:
a. En el main deberás pedir el día y el mes al usuario y llamar a la función
diaSiguiente()
b. diaSiguiente(). Da solución al problema planteado llamando a otra
función diasMes(mes), que es una función que especifica dependiendo
el mes que sea, los días que tiene cada mes.
c. Hazlo como estimes oportuno, aunque la fecha debe imprimirse en el
main, y los valores deben guardarse en las variables día y mes que pediste
al principio del ejercicio. IMPORTANTE: comprueba que el día siguiente
del 31/12 es el 1/1!!
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes;
        
        System.out.print("Dime el día: ");
        dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        mes = scanner.nextInt();

        int[] fechaSiguiente = diaSiguiente(dia, mes);

        System.out.println("La fecha del día siguiente es: " + fechaSiguiente[0] + "/" + fechaSiguiente[1]);
    }
    
     public static int[] diaSiguiente(int dia, int mes) {
        int diasEnMes = diasMes(mes);

        if (dia < diasEnMes) {
            dia++; 
        } else {
            dia = 1; 
            if (mes < 12) {
                mes++; 
            } else {
                mes = 1; 
            }
        }
        return new int[] {dia, mes};
        
        
        /* 
        int diaDelMes = diaMes(mes);
        if(dia< diaDelMes){
            dia++;
        } else{
            dia = 1;
            mes++;
        }
        
        if (mes>12){
            mes = 1;
        }
        return "" +dia "/"+mes;
        */
    }

    public static int diasMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; 
            default:
                return 0; 
        }
        
        /*
        int [] meses = {31,28,31,30,31,30,31,31,30,31,30,31}
        return mese[mes-1];  (empezar 1 desde enero y no desde febrero posicion 0 pasa a empezar en 1)
        */
    
    }
}
