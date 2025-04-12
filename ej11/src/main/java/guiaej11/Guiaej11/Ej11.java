/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej11.Guiaej11;

/**
 *
 * @author kitty10
 */
public class Ej11 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Domicilio dom = new Domicilio("Av. Triunvirato",3174,"Villa Ortuzar");
        Persona p1 = new Persona("Fulano","Gomez","16/04/1990",dom);
        Persona p2 = new Persona("Mengana","Torres","23/11/1991",dom);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        p1.modificarDomicilio("irigoyen", 1506, "versalles");
        System.out.println("dom: " + dom);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }
}
