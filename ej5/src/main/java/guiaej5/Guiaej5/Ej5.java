/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej5.Guiaej5;

/**
 *
 * @author kitty
 */
public class Ej5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Fraccion fraccion = new Fraccion(1, 2);
        System.out.println(fraccion.mostrarFraccion());
        fraccion.sumarEntero(1);
        System.out.println(fraccion.mostrarFraccion());
        Fraccion fraccion2 = new Fraccion(1, 4);
        fraccion.sumarFraccion(fraccion2);
        System.out.println(fraccion.mostrarFraccion());
        fraccion.simplifarFraccion();
        System.out.println(fraccion.mostrarFraccion());
        System.out.println(fraccion.esFraccionImpropia());
        System.out.println(fraccion.esFraccionPropia());
        System.out.println(fraccion.esFraccionAparente());
    }
}
