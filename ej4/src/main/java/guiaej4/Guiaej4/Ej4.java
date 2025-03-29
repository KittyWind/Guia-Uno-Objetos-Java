/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej4.Guiaej4;

/**
 *
 * @author kitty
 */
public class Ej4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Fecha fecha = new Fecha(30, 1, 2021);
        System.out.println(fecha.devolverFecha());
        fecha.esNavidad();
        fecha.sumarMes();
        System.out.println(fecha.devolverFecha());
    }
}
