/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Random;

/**
 * @author anago
 */
public class AmigoInvisible {

    public static void main(String[] args) {
        String[] alumnos = {
            "Amador Boza, José Rene","Arcila Lupianez, Alejandra","Cano Ruiz, Francisco Javier","Casado Prieto, Alejandro",
            "Casas Secosan, Juan David","Cotta Merino, Miguel","Franco Mesa, José Luis","Fuentes Parra, Jose Luis",
            "Gomez Jurado, Ana","Malagon Garcia, Antonio","Martínez Henao, Jackson","Montero Galan, Juan Ildefonso",
            "Morales Cornejo, Lucia","Perez Chico, Joaquin","Ranchal Guillen, Daniel","Reyes Camacho, Concepción",
            "Roldan Marin, Ruben","Sanchez-Beato Jimenez, Alejandro","Sierra Diaz, Alejandro","Vinas Arribas, Amelia" };
        
        Random random = new Random();
        String[] alumnosAleatorios = new String[alumnos.length];
        boolean[] alumnosRepetidos = new boolean[alumnos.length];  // Para evitar repeticiones

        for (int i = 0; i < alumnos.length; i++) {
            int aleatorio  = 0;
            do {
                // Generamos un índice aleatorio
                aleatorio = random.nextInt(alumnos.length);
            } while (aleatorio == i || alumnosRepetidos[aleatorio]);  // Aseguramos que no se asigne a sí mismo y que no se repita
            alumnosRepetidos[aleatorio] = true;
            alumnosAleatorios[i] = alumnos[aleatorio];  
        }

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnosAleatorios[i] + " le regala a " + alumnos[i]);
        }
    }
}
