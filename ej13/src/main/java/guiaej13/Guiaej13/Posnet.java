/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej13.Guiaej13;

/**
 *
 * @author kitty
 */
public class Posnet {
    private final int CUOTA_MINIMA_PARA_RECARGO = 2;
    private final int PORCENTAJE_POR_CUOTA = 3;
    public Ticket efectuarPagos(TarjetaDeCredito tarjetaDeCredito,double monto,int cuota){
        Ticket ticket = null;
        if(cuota > 0){
            if (cuota >= CUOTA_MINIMA_PARA_RECARGO) {
                monto = monto + ((PORCENTAJE_POR_CUOTA * cuota - 3)/100.0)* monto;
            }
            if(tarjetaDeCredito.tieneSaldoSuficiente(monto)){
                ticket = new Ticket(tarjetaDeCredito.getTitular(),monto/cuota,monto);
                tarjetaDeCredito.descontarSueldo(monto/cuota);
                System.out.println("pago realizado con exito");
            }else{
                System.out.println("pago sin realizar, saldo insuficiente");
            }
        }else{
            System.out.println("pago sin realizar, no puede haber 0 cuotas");
        }
        return ticket;
    }
}
