/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej7.Guiaej7;

/**
 *
 * @author kitty
 */
public class Robot {

    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public void Saludar(){
        System.out.println("Hola, mi nombre es " + nombre + ". ¿En qué puedo ayudarte?");
    }

    public void Saludar(Persona persona){
        System.out.println("Hola, " + persona.NombreCompleto() + ". Mi nombre es " + nombre + ". ¿En qué puedo ayudarte?");
    }
}
