/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej11.Guiaej11;

/**
 *
 * @author kitty10
 */
public class CuentaBancaria {
    private Persona titular;
    private String CBU;
    private TipoCuenta tipoCuenta;
    private int sueldo;
    private String fechaApertura;
    
    public CuentaBancaria(Persona titular, String CBU, TipoCuenta tipoCuenta, String fechaApertura) {
        this.titular = titular;
        this.CBU = CBU;
        this.tipoCuenta = tipoCuenta;
        this.sueldo = 0;
        this.fechaApertura = fechaApertura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBancaria{");
        sb.append("titular=").append(titular);
        sb.append(", CBU=").append(CBU);
        sb.append(", tipoCuenta=").append(tipoCuenta);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", fechaApertura=").append(fechaApertura);
        sb.append('}');
        return sb.toString();
    }
    
}
