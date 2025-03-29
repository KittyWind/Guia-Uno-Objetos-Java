/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guia1ej12.Guia1ej12;

/**
 *
 * @author kitty
 */
public class Impresora {
    private boolean encendido;
    private Bandeja bandeja;
    private Tinta tinta;

    public Impresora() {
        this.encendido = false;
        this.bandeja = new Bandeja();
        this.tinta = new Tinta();
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void recargarBandeja(int cant){
        this.bandeja.recargarBandeja(cant);
    }

    public void subirNivelTinta(int cant){
        this.tinta.subirNivelTinta(cant);
    }

    public boolean verificarTinta(int caracteres){
        return this.tinta.haySuficienteTinta(caracteres);
    }

    public boolean verificarBandeja(int caracteres){
        return this.bandeja.haySuficientesHojas(caracteres);
    }

    public void imprimir(Documento document){
        //esta bien asi? preguntar al profe en clase
        if(this.encendido){
            if(verificarBandeja(document.calcularCantCaracteres())){
                if(verificarTinta(document.calcularCantCaracteres())){
                    System.out.println("cantidad de hojas antes de la impresion: " + this.bandeja.getCantHojas());
                    System.out.println("nivel de tinta antes de la impresion: " + this.tinta.getNivelTinta());
                    this.bandeja.usarHojas(document.calcularCantCaracteres());
                    this.tinta.usarTinta(document.calcularCantCaracteres());
                    System.out.println(document.getFecha() + "                " + document.getTitulo());
                    System.out.println(document.getContenido());
                    System.out.println("cantidad de hojas despues de la impresion: " + this.bandeja.getCantHojas());
                    System.out.println("nivel de tinta despues de la impresion: " + this.tinta.getNivelTinta());
                } else {
                    System.out.println("error: no hay suficiente tinta");
                }
            } else {
                System.out.println("error: no hay suficientes hojas");
            }
        } else {
            System.out.println("error: la impresora esta apagada");
        }
    }
}
