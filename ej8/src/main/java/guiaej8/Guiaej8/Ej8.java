/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej8.Guiaej8;

/**
 *
 * @author kitty
 */
public class Ej8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Password pass = new Password("123456");
        System.out.println(pass.esFuerte());
        System.out.println(pass.nuevoValor("1234567"));
        System.out.println(pass.esFuerte());
    }
}
