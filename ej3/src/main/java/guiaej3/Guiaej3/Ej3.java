/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej3.Guiaej3;

/**
 *
 * @author kitty
 */
public class Ej3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CuentaBancaria cuenta = new CuentaBancaria("123456789", TipoCuenta.CORRIENTE);
        cuenta.depositarSueldo(1000);
        cuenta.extraerSueldo(1500);
        System.out.println(cuenta.getSueldo());
        cuenta.extraerUltimosTresDigitos();
    }
}
