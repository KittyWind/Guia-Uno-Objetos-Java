/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guiaej13.Guiaej13;

/**
 *
 * @author kitty
 */
public class Ej13 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Domicilio domicilio = new Domicilio("Irigoyen",1506,"Versalles");
        Titular titular = new Titular("Kimi","Akiyama","17/3/2002",domicilio);
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("1514454878789895", EntidadFinanciera.MAESTRO, titular, 15000, "Banco Nacion");
        Posnet posnet = new Posnet();
        Ticket ticket = posnet.efectuarPagos(tarjetaDeCredito, 10000,5);
        if(ticket != null){
            ticket.generarTicket();
        }
        System.out.println("tarjeta: " + tarjetaDeCredito.toString());
    }
}
