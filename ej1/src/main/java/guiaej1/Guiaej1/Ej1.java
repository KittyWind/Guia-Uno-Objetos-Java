/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej1.Guiaej1;

/**
 *
 * @author kitty
 */
public class Ej1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona persona = new Persona(2003,"Lyra","Leckman");
        System.out.println(persona.getIdentidad());
        System.out.println("edad de la persona: " + persona.getEdad());
        System.out.println(persona.esMayor(22));
        System.out.println(persona.toString());
        persona.setNombreApellido("Kitty", "wind");
        System.out.println(persona.toString());
    }
}
