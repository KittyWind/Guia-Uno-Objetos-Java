/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej13.Guiaej13;

/**
 *
 * @author Alumno
 */
public class Ticket {
    private Titular titular;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(Titular titular, double montoPorCuota, double montoTotal ) {
        this.montoPorCuota = montoPorCuota;
        this.montoTotal = montoTotal;
        this.titular = titular;
    }
    
    public void generarTicket(){
        System.out.println("cliente: " + titular.getNombreCompleto());
        System.out.println("monto a cobrar: " + montoTotal);
        System.out.println("monto por cuota: " + montoPorCuota);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket{");
        sb.append("titular=").append(titular);
        sb.append(", montoTotal=").append(montoTotal);
        sb.append(", montoPorCuota=").append(montoPorCuota);
        sb.append('}');
        return sb.toString();
    }

    
}
