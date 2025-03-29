/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaej3.Guiaej3;

/**
 *
 * @author kitty
 */
public class CuentaBancaria {
    private String CBU;
    private TipoCuenta tipoCuenta;
    private int sueldo;

    public CuentaBancaria(String CBU, TipoCuenta tipoCuenta) {
        this.CBU = CBU;
        this.tipoCuenta = tipoCuenta;
        this.sueldo = 0;
    }

    public String getCBU() {
        return CBU;
    }

    public void setCBU(String CBU) {
        this.CBU = CBU;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    public void depositarSueldo(int monto){
        if(monto > 0){
            System.out.println("sueldo anterior: " + this.sueldo);
            this.sueldo += monto;
            System.out.println("sueldo actualizado: " + this.sueldo);
        }
        else{
            System.out.println("no se admiten montos negativos");
        }
    }
    
    public void extraerSueldo(int monto){
        if(monto > 0){
            if(this.sueldo >= monto || ((this.sueldo < monto) && (this.tipoCuenta == TipoCuenta.CORRIENTE))){
                System.out.println("sueldo anterior: " + this.sueldo);
                this.sueldo -= monto;
                System.out.println("sueldo actualizado: " + this.sueldo);
                System.out.println("monto extraido: " + monto);
            }
            else{
                System.out.println("No se puede extraer mas de lo que se tiene en la cuenta");
            }
        }
    }

    public void extraerUltimosTresDigitos(){
        String ultimosTresDigitos = CBU.substring(CBU.length() - 3);
        System.out.println("Ultimos tres digitos de CBU: " + ultimosTresDigitos);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBancaria{");
        sb.append("CBU=").append(CBU);
        sb.append(", tipoCuenta=").append(tipoCuenta);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
