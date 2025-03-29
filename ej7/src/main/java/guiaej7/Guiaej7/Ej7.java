/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej7.Guiaej7;

/**
 *
 * @author kitty
 */
public class Ej7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Robot r = new Robot("R2D2");
        Persona p = new Persona("Juan", "Perez");
        r.Saludar();
        r.Saludar(p);
    }
}
