/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej4.Guiaej4;

/**
 *
 * @author kitty
 */
public class Fecha {
    private final int DIA_NAVIDAD = 25;
    private final int MES_NAVIDAD = 12;
    private final int MAX_MES = 12;
    private final int DIAS_DE_FEBRERO = 28;
    private final int MES_DE_FEBRERO = 2;
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String devolverFecha() {
        return dia + "/" + mes + "/" + anio;
    }

    public void esNavidad(){
        if (dia == DIA_NAVIDAD && mes == MES_NAVIDAD) {
            System.out.println("Es Navidad");
        } else {
            System.out.println("No es Navidad");
        }
    }

    public void sumarMes(){
        mes++;
        if (mes > MAX_MES) {
            mes = 1;
            anio++;
        }
        else if (mes == MES_DE_FEBRERO && dia > DIAS_DE_FEBRERO) {
            dia = 1;
        }
    }
}
