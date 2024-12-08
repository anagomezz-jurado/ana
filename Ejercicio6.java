/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
6.- Realiza un método en Java para calcular la suma de los dígitos de un entero.
Datos de prueba:
* Introduce un número entero: 25
Salida esperada:
La suma es: 7
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número entero: ");
        numero = sc.nextInt();
        
        System.out.println("La suma de los digitos de " + numero +" es: "+cuentaDigitos(numero));
        System.out.println("La suma de " + numero +" es: "+cuentaDigitosConCadena(numero));
        
        System.out.println("Es biesto? "+ esBisiesto(numero));
    }
    
    
    static int cuentaDigitos(int numero){
       int suma =0;
       
       while(numero > 9){
           suma += (numero % 10);
           numero /= 10;
       }
       suma += numero;       
       return suma;
    }

    static int cuentaDigitosConCadena(int numero) {
        int suma = 0;   
        //String numeroEnCadena = ""+numero;
        String numeroEnCadena = String.valueOf(numero);
        
        for(int i = 0; i < numeroEnCadena.length(); i++){
            char caracter = numeroEnCadena.charAt(i);
            int digito = getNumericValue(caracter);
            //int digito = Integer.parseInt(""+ caracter);

            suma += digito;
        }        
        return suma;
    }
    
    static int getNumericValue(char caracter){
        return Integer.parseInt(String.valueOf(caracter));
    }
    
    private static boolean esBisiesto(int año) {
        
        
        /*
        boolean bisiesto;
        if ((aÃ±o%4==0 && !(aÃ±o%100 == 0)) || (aÃ±o%400==0)){
            bisiesto = true;
        }else{
            bisiesto = false;
        }
        return bisiesto;
        */
        return ((año%4==0 && !(año%100 == 0)) || (año%400==0));
    }
   
}
