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
        if (dia == 25 && mes == 12) {
            System.out.println("Es Navidad");
        } else {
            System.out.println("No es Navidad");
        }
    }

    public void sumarMes(){
        mes++;
        if (mes > 12) {
            mes = 1;
            anio++;
        }
        else if (mes == 2 && dia > 28) {
            dia = 1;
        }
    }
}
