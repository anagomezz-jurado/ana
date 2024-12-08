/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.dos;

import java.util.Scanner;

/**
 * 17.- Tienes almacenados los nombres de los platos de un restaurante en el
 * array PLATOS [20]. Y has almacenado sus precios en el array PRECIOS [20].
 * Realiza un programa que muestre los platos y sus precios. La aplicación debe
 * preguntarte qué platos quieres. Al final, el programa debe mostrar la
 * factura. NOTA: Debes aplicar un 16% de IVA al total de la factura. Tienes que
 * validar si el plato solicitado está en la lista de platos posibles.
 */
public class Ejercicio17 {

    static String[] PLATOS = new String[20];
    static double[] PRECIOS = new double[20];
    static Scanner sc = new Scanner(System.in);
    static double cuenta = 0;
    
    public static void main(String[] args) {
        //PLATOS
        PLATOS[0] = "Plato de jamón";
        PLATOS[1] = "Ensaladilla";
        PLATOS[2] = "Patatas bravas";
        PLATOS[3] = "Gambas";
        PLATOS[4] = "Cocido";
        PLATOS[5] = "Sopa";
        PLATOS[6] = "Solomillo";
        PLATOS[7] = "Secreto";
        PLATOS[8] = "Flamenquín";
        PLATOS[9] = "Croquetas";
        PLATOS[10] = "San Jacobo";
        PLATOS[11] = "Pechuga empanada";
        PLATOS[12] = "Salmón";
        PLATOS[13] = "Sardinas";
        PLATOS[14] = "Paella";
        PLATOS[15] = "Sandwich";
        PLATOS[16] = "Hamburguesa normal";
        PLATOS[17] = "Hamburguesa XL";
        PLATOS[18] = "Pizza de 4 quesos";
        PLATOS[19] = "Pizza de jamon york";

        //PRECIOSPLATOS [0] = "cocido";
        PRECIOS[0] = 12;
        PRECIOS[1] = 4.50;
        PRECIOS[2] = 3.50;
        PRECIOS[3] = 9;
        PRECIOS[4] = 6.50;
        PRECIOS[5] = 7;
        PRECIOS[6] = 16;
        PRECIOS[7] = 16;
        PRECIOS[8] = 8;
        PRECIOS[9] = 8;
        PRECIOS[10] = 8;
        PRECIOS[11] = 6.50;
        PRECIOS[12] = 13.50;
        PRECIOS[13] = 7;
        PRECIOS[14] = 15;
        PRECIOS[15] = 2.50;
        PRECIOS[16] = 7.50;
        PRECIOS[17] = 10;
        PRECIOS[18] = 6.50;
        PRECIOS[19] = 6.50;

        mostrarCarta();
        char decision;
        
        do {          
            buscarPlato();
            System.out.print("¿Quieres otro plato más?");
            decision = sc.nextLine().charAt(0);
            
        } while (decision == 'S' || decision == 's');
        
        mostrarPedido();
      
    }

    static void mostrarCarta() {
        System.out.println("------------------------------------");
        System.out.printf("|%-25s|%8s|%n", "PLATOS", "PRECIOS");
        System.out.println("------------------------------------");
        for (int i = 0; i < PLATOS.length - 1; i++) {
            System.out.printf("|%d.-%-22s|%7.2f?|%n", i + 1, PLATOS[i], PRECIOS[i]);
        }
    }
    
    static void buscarPlato(){        
        System.out.println(" ");
        System.out.println("Dime que plato quieres: ");
        String pedido = sc.nextLine();
        
        int posicion = 0;
        boolean encontrado = false;
        
        while (!encontrado && posicion < PLATOS.length - 1){
            if(PLATOS[posicion].equalsIgnoreCase(pedido)){
                encontrado = true;
            }
            else {
                posicion ++;
            }
        }
        
        if (encontrado) {
            System.out.println("El plato se encuentra en la lista");
            cuenta += PRECIOS[posicion];
        }
        else{
            System.out.println("El plato no se encuentra en la lista");
        }   
        
    }
    
    static void mostrarPedido(){
        double iva = cuenta * 0.16;
        double totalFactura = cuenta + iva;
        
        System.out.println("Total sin IVA es : " + cuenta );
        System.out.println("Total con IVA es: " + totalFactura);
        
    }
}
