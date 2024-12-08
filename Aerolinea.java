/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/***/
public class Aerolinea { 
    public static void main(String[] args) {
        final int MAX_CAROS = 5;
        final int MAX_BARATOS = 5;
        final int ASIENTOS = MAX_CAROS + MAX_BARATOS;

        boolean[] asientos = new boolean[ASIENTOS];
        int asientosBaratosAsignados = 0;
        int asientosCarosAsignados = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("¿Qué asiento desea? (1 primera clase, 2 económico): ");
            int opcionElegida = sc.nextInt();
            sc.nextLine();
            if (opcionElegida == 1) { //Elijo primera clase
                if (asientosCarosAsignados < MAX_CAROS) {
                    asientos[asientosCarosAsignados] = true;
                    asientosCarosAsignados++;
                    mostrarBillete(asientos, 1, asientosCarosAsignados);
                } else {
                    System.out.print("Primera clase completa.¿Desea de segunda clase? (S/N)");
                    String opcion = sc.nextLine();

                    if (opcion.equalsIgnoreCase("S")) {
                        if (asientosBaratosAsignados < MAX_BARATOS) {
                            asientos[MAX_CAROS + asientosBaratosAsignados] = true;
                            asientosBaratosAsignados++;
                            mostrarBillete(asientos, 2, asientosBaratosAsignados); } } }
            } else //Elijo clase Económica
            if (asientosBaratosAsignados < MAX_BARATOS) { //Tengo en primera clase
                asientos[MAX_CAROS + asientosBaratosAsignados] = true;
                asientosBaratosAsignados++;
                mostrarBillete(asientos, 2, asientosBaratosAsignados);
            } else { //Ya no quedan en primera clase
                System.out.print("Clase económica completa.¿Desea de primera clase? (S/N)");
                String opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    if (asientosCarosAsignados < MAX_CAROS) {
                        asientos[asientosCarosAsignados] = true;
                        asientosCarosAsignados++;
                        mostrarBillete(asientos, 1, asientosCarosAsignados); } } }
        } while (asientosBaratosAsignados + asientosCarosAsignados < ASIENTOS);
        
        if (asientosBaratosAsignados + asientosCarosAsignados == ASIENTOS) {
            System.out.println("El próximo vuelo sale en 3 horas");
        } }

    static void mostrarBillete(boolean[] asientos, int clase, int asignado) {
        System.out.println("===============================================================");
        System.out.printf("Su billetes es de %s clase y es el número %d%n", clase == 1 ? "Primera" : "Económica", asignado);
        System.out.println("===============================================================");
        System.out.println("Estado de los asientos: ");
        int contador = 0;
        for (boolean asiento : asientos) {
            System.out.printf("Asiento %d %s %n", contador++, (asiento?"Ocupado":"Libre"));

        }
    }

}
