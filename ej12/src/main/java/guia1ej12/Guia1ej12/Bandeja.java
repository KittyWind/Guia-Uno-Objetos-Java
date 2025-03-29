/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guia1ej12.Guia1ej12;

/**
 *
 * @author kitty
 */
public class Bandeja {
    private static final int CANT_CARACTERES_POR_HOJA = 20;
    private static final int CANT_MAX_HOJAS = 35;
    private static final int CANT_MIN_HOJAS = 0;
    private int cantHojas;

    
    public Bandeja() {
        this.cantHojas = 0;
    }

    

    public void recargarBandeja(int cant){
        int aux = this.getCantHojas() + cant;

        if (cant < CANT_MIN_HOJAS) {
            System.out.println("error: cantidad negativa, sin cambios en la bandeja de hojas");
        } else if (aux <= CANT_MAX_HOJAS){
            this.setCantHojas(aux);
        } else if (aux > CANT_MAX_HOJAS) {
            System.out.println("error: cantidad superada, sin cambios en la bandeja de hojas");
        }
    }

    public boolean haySuficientesHojas(int caracteres){
        return this.getCantHojas() >= (int)caracteres/CANT_CARACTERES_POR_HOJA;
    }

    public void usarHojas(int caracteres){
        //this.setCantHojas(this.getCantHojas() - (int)caracteres/CANT_CARACTERES_POR_HOJA);
        this.cantHojas -= (int)caracteres/CANT_CARACTERES_POR_HOJA;
    }

    public int getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bandeja{");
        sb.append("cantHojas=").append(cantHojas);
        sb.append('}');
        return sb.toString();
    }


}
