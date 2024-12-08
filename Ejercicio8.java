/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 8.- Realiza un método en Java para comprobar si una cadena es una contraseña
válida.
Reglas de contraseña:
a) Una contraseña debe tener al menos ocho caracteres.
b) Una contraseña consta solo de letras y dígitos.
c) Una contraseña debe contener al menos 2 dígitos.
Salida esperada:
1. Una contraseña debe tener al menos ocho caracteres.
2. Una contraseña consta solo de letras y dígitos.
3. Una contraseña debe contener al menos 2 dígitos.
Introduce una contraseña (Usted acepta los términos y condiciones): abcd1234
La contraseña es válida: abcd1234

 */
public class Ejercicio8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                           introduce una contreasena valida para que se vaslida tine que contener el siguiente formato 
                           a) Una contrasena debe tener al menos ocho caracteres.
                           b) Una contrasena consta solo de letras y didgitos.
                           c) Una contrasena debe contener al menos 2 digitos""");
        String password = scanner.nextLine(); 
        switch (comprobacion(password)) {

            case 1:
                System.out.println("la contraseña no es valida, segun la regla a");
                break;
            case 2:
                System.out.println("la contraseña no es valida, segun la regla b");
                break;
            case 3:
                System.out.println("la contraseña no es valida, segun la regla c");
                break;
                
                

            default:
                System.out.printf("la contraseña %s es valida ", password);
        }

    }

    static int comprobacion(String password) {
        password = password.toLowerCase();
        int count = 0, error = 0, countAlfabeto = 0, countNumero = 0;
        String alfabeto = "qwertyuiopasdfghjklzxcvbnmçñ";
        String numero = "0123456789";
//         comprobamos la opcion a
        if (password.length() < 8) {
//            la contraseña no es valida, segun la regla a
            error = 1;

        }
//         comprobamos la opcion c
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if (password.charAt(i) == alfabeto.charAt(j)) {
                    countAlfabeto++;

                }

            }
           
        }
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < numero.length(); j++) {
                if (password.charAt(i) == numero.charAt(j)) {
                    countNumero++;

                }

            }

        }
        count = countAlfabeto + countNumero;
        if (count != password.length()) {
//      la contraseña no es valida, segun la regla b
            error = 2;

        }

        if (countNumero < 2) {
//           la contraseña no es valida, segun la regla c
            error = 3;

        }
        
        return error;
       
               
    }
  

}
