/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclefor;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, i;
        String resultado = "";
        
        System.out.println("Dime un número: ");
        numero = sc.nextInt();
        
        String cadena = String.valueOf(numero);
        
        for (i = 0; i < cadena.length(); i++){
            resultado += cadena.charAt(i);
            
            if (i < cadena.length() - 1) {
                resultado += "-";
            }
        }
        
        System.out.println("Los dígitos separados son: " + resultado);
        
        sc.close();
    }
    
    
    //numero = numero < 0 ? -numero : numero;  (Para que no funcione con negativos)
    /**
     * salida = "" + (numero % 10);
     * while (numero > 9){
     *  numero /= 10;
     *  salida = (numero % 10) + "-" + salida;
     * }
     * sout(salida);
     */
}
