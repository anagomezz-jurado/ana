/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaLista;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class Ejer11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String sexo = "";
        int salario = 0, edad = 0, mujerConSalarioMenor700 = 0, cantidad, hombresConSalarioMayor800 = 0;
        boolean mujerConSalarioMayor900 = false;
        
        
        System.out.print("¿Cuántos empleados vas a registrar? ");
        cantidad = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++){
        
        System.out.print("Introduce el nombre del empleado");
        nombre = sc.nextLine();

        while (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.print("Di si es masculinoo femenino (F o M): ");
            sexo = sc.nextLine();
        }

        while (salario <= 500 || salario >= 1000) {
            System.out.println("Dime el salario: ");
            salario = sc.nextInt();
        }

        while (edad <= 18 || edad > 65) {
            System.out.println("Dime la edad del empleado: ");
            edad = sc.nextInt();

        }
        
        //LIMPIAR BUFFER
        sc.nextLine();
        
        if (sexo.equals('F')){
            if (salario < 700){
                mujerConSalarioMenor700++;
            }
            if (salario > 900){
                mujerConSalarioMayor900 = true;
            }
        } else if (sexo.equals("M")){
            if (salario > 800){
                hombresConSalarioMayor800++;
            }
        }
        }
        
        
        System.out.println("Número de mujeres que ganan menos de 700€: " +mujerConSalarioMenor700);
        System.out.println("Número de hombres que ganan más de 800€: "+hombresConSalarioMayor800);
        
        
         if (mujerConSalarioMayor900) {
            System.out.println("Existe al menos una mujer que gana más de 900€.");
        } else {
            System.out.println("No hay ninguna mujer que gane más de 900€.");
        }

        // Cerrar el Scanner
        sc.close();
    }
    
}
