/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author anago
 */
public class Persona {
    
    // Variables de instancia
    private String nombre;
    private int edad;
    private String genero;
    
    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    //Sobreescrbir el constructor
    public Persona (String nombre){
        this.nombre = nombre;
        this.edad = 18;
        this.genero = "Indefinido";
    }
    
    public Persona(){
        this.nombre = "Anonimo";
        this.edad = 20;
        this.genero = "Hombre";
    }
    
    // Métodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + "  tengo " + edad + " años y mi sexo es : " + genero);
    }
    
    public void cumplirAnios(){
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
                
    }
    
    
    public static void main(String[] args) {
        //Creamos un objeto
        Persona persona1 = new Persona("Elena", 30, "Mujer");
        Persona persona2 = new Persona("Juan", 70, "Hombre");
        Persona persona3 = new Persona ("Jose Luis");
        Persona persona4 = new Persona ();
        persona1.saludar();
        persona1.cumplirAnios();  //Cumple años
        persona1.saludar();
        
        persona2.saludar();
        persona3.saludar();
        persona4.saludar();
        
    }
    
}
