/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
5.    Un programa que almacene en una tabla el número de días que 
* tiene cada mes (de un año no bisiesto), pida al usuario que le indique 
* un mes (febrero) y un día (ej. el día 15) y diga qué número de día es 
* dentro del año (por ejemplo, el 15 de febrero sería el día número 46, 
* el 31 de diciembre sería el día 365, el 15 de marzo sería 74, el 28 de 
* Febrero sería 59). NOTA: tendrás que hacer una función para que te pase 
* el mes en letra que ha introducido el usuario a un número que represente 
* el mes.
 */
public class Ejercicio5 {
    
    public static int [] diasmes = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
            "julio", "agosto", "septiembre","octubre", "noviembre", "diciembre"};
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el mes (escrito): ");
        String mes = sc.nextLine();
        
        System.out.print("Dime el día: ");
        int dia = sc.nextInt();
        
        int diasAcumulados = 0;
        
        for (int i = 0; i < mesAint(mes); i++) {
            diasAcumulados += diasmes[i];
        }
        diasAcumulados += dia;
        

        
        System.out.println("El día " + dia + " del " +mes+ " es el " + diasAcumulados + " del año. " );
        System.out.printf("El día %d de %s es el %d del año\n", dia, mes, diasAcumulados);
    }
    
    static int mesAint(String m){
        for (int i = 0; i < meses.length; i++) {
            if(meses[i].equalsIgnoreCase(m))return i;
        }
        return -1;
    }
    
}
