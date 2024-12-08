/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
1.- Realiza una clase en Java de nombre Vehículo que contenga como atributos el modelo de tipo String, la
potencia de tipo double y la tracción a las cuatro ruedas de tipo boolean. El constructor de la clase admitirá como
argumento el modelo y tendrá como métodos de tipo dame y pon para la potencia y para la tracción a las cuatro
ruedas. La clase contará con el método imprimir que retorna los datos de cada vehículo y si tiene o no tracción a las
cuatro ruedas.
 */
public class Vehiculos {
    String modelo;
    double potencia;
    boolean ruedas;
    
    //Constructor
    public Vehiculos(String modelo){
        this.modelo = modelo;
    }
    
    //Métodos
    public double damePotencia() {
        return potencia;
    }

    public void ponPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public boolean dameTraccionRuedas() {
        return ruedas;
    }

    public void ponTraccionRuedas(boolean traccion) {
        this.ruedas = traccion;
    }
    
    public String toString(){
        String verificarRuedas = ruedas ? "Sí" : "No";
        return "Modelo: " + modelo + "\nPotencia: " + potencia + "\nTracción de cuatro ruedas: " + verificarRuedas;
    }
    
    public static void main(String[] args) {
        Vehiculos vehiculo1 = new Vehiculos("Kia");
        
        vehiculo1.ponPotencia(100);
        vehiculo1.ponTraccionRuedas(true);
        
        System.out.println(vehiculo1.toString());
    }
}
