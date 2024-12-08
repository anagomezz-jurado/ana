/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Random;

/**
1.B. Juego de la ruleta con los alumnos de clase. Si sale uno elegido no puede 
* repetir hasta que no hayan salido todos:
 */
public class Ejercicio1B {

    public static void main(String[] args) {
        String[] alumnos = {
            "Amador Boza, José René",
            "Arcila Lupiáñez, Alejandra",
            "Cano Ruiz, Francisco Javier",
            "Casado Prieto, Alejandro",
            "Casas Secosan, Juan David",
            "Cotta Merino, Miguel",
            "Franco Mesa, José Luis",
            "Fuentes Parra, José Luis",
            "Gómez Jurado, Ana",
            "Gómez Sánchez de Puerta, Ana",
            "Malagón García, Antonio",
            "Martínez Henao, Jackson",
            "Montero Galán, Juan Ildefonso",
            "Morales Cornejo, Lucía",
            "Pérez Chico, Joaquín",
            "Ranchal Guillén, Daniel",
            "Reyes Camacho, Concepción",
            "Roldán Marín, Rubén",
            "Sánchez-Beato Jiménez, Alejandro",
            "Sierra Díaz, Alejandro",
            "Viñas Arribas, Amelia"
        };
        
        long ahora = System.currentTimeMillis();
                
        String[] salida = ruleta(alumnos);

        for (int i = 0; i < salida.length; i++) {
            System.out.println(i + "-" + salida[i]);
        }
        long despues = System.currentTimeMillis();
        
        System.out.printf("He tardado en hacer mi ejercicio %d milisegundos\n", (despues-ahora));
                

    }

    static String[] ruleta(String[] cosas) {

        String[] resultado = new String[cosas.length];

        int contador = 0;
        Random r = new Random();

        while (contador < cosas.length) {
            int aleatorio = r.nextInt(cosas.length);
            if (cosas[aleatorio] != null) {
                resultado[contador] = cosas[aleatorio];
                cosas[aleatorio] = null;

            } else {
                while (cosas[aleatorio] == null) {
                    aleatorio++;
                    aleatorio = aleatorio % cosas.length;
                }
                resultado[contador] = cosas[aleatorio];
                cosas[aleatorio] = null;

            }
            contador++;

        }
        return resultado;
    }
}
