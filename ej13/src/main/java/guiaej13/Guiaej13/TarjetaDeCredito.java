/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej13.Guiaej13;

/**
 *
 * @author kitty
 */
public class TarjetaDeCredito {
    private String numero;
    private EntidadFinanciera entidadFinanciera;
    private Titular titular;
    private double saldo;
    private String entidadBancaria;

    public TarjetaDeCredito(String numero, EntidadFinanciera entidadFinanciera, Titular titular, double saldo, String entidadBancaria) {
        this.numero = numero;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
        this.saldo = saldo;
        this.entidadBancaria = entidadBancaria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public boolean tieneSaldoSuficiente(double montoTotal){
        return saldo >= montoTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TarjetaDeCredito{");
        sb.append("numero=").append(numero);
        sb.append(", entidadFinanciera=").append(entidadFinanciera);
        sb.append(", titular=").append(titular);
        sb.append(", saldo=").append(saldo);
        sb.append(", entidadBancaria=").append(entidadBancaria);
        sb.append('}');
        return sb.toString();
    }
    
    public void descontarSueldo(double monto){
        if (monto > 0){
            saldo -= monto;
        }
    }
}
