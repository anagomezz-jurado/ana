/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author anago
 */
public class Gatos {
    double peso;
    int edad;
    String color;
    String raza;
    String sexo;

    //Constructor
    public Gatos(double peso, int edad, String color, String raza, String sexo) {
        this.peso = peso;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
    }

    public Gatos() {
        this.peso = 4.2;
        this.edad = 3;
        this.color = "Blanco";
        this.raza = "Siamés";
        this.sexo = "Macho";
    }

    @Override //Sobreescribir
    public String toString() {
        return "El gato pesa  " + this.peso + ", tiene " + this.edad + ", es de color " + this.color
                + ", es de raza " + this.raza + ", y su sexo es " + this.sexo;
    }

    @Override //Sobreescribir
    public boolean equals(Object obj){ 
        Gatos g = (Gatos) obj;

        return this.raza.equalsIgnoreCase(g.raza) && this.sexo.equalsIgnoreCase(g.sexo);
    }
    
    public void pelea(Gatos contrincante){ 
        if(this.sexo.equals("hembra")){
                System.out.println("No me gusta pelear");
        }else{
            if (contrincante.sexo.equals("hembra")){
                System.out.println("No peleo contra gatitas");
            } else { 
                System.out.println("Ven aquí que te vas a enterar");
                if (this.peso > contrincante.peso){
                    System.out.println("He ganado a: " + contrincante);
                } else{
                    System.out.println("Ha ganado el contrincante");
                }
            }
        }
    }

    
    // Métodos
    public void maullar() {
        System.out.println("miaaaaauuu");
    }

    public void ronronear() {
        System.out.println("mrrrrrr");
    }

    public static void main(String[] args) {
        //Creamos un objeto
        Gatos gato1 = new Gatos();
        Gatos gato2 = new Gatos(4.5, 7, "Negro", "Abisinio", "Macho");
        System.out.println(gato1);
        gato1.maullar();
        gato1.ronronear();
        
        gato1.pelea(gato2);
    }
}
