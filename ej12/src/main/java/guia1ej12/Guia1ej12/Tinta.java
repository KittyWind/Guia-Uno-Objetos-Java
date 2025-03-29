/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej12.Guia1ej12;

/**
 *
 * @author kitty
 */
public class Tinta {

    private static final int CANT_CARACTERES_POR_PUNTO = 50;
    private int nivelTinta;

    public Tinta() {
        nivelTinta = 100;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public int nivelSegunCantCaracteres(int caracteres) {
        return caracteres/CANT_CARACTERES_POR_PUNTO;
    } 

    public void usarTinta(int caracteres){
        //this.setNivelTinta(this.getNivelTinta() - this.nivelSegunCantCaracteres(caracteres));
        nivelTinta -= nivelSegunCantCaracteres(caracteres);
    }

    public void subirNivelTinta(int cant){
        //this.setNivelTinta(this.getNivelTinta() + cant);
        nivelTinta += cant;
    }

    public boolean haySuficienteTinta(int caracteres){
        //return this.getNivelTinta() >= this.nivelSegunCantCaracteres(caracteres);
        return nivelTinta >= nivelSegunCantCaracteres(caracteres);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tinta{");
        sb.append("nivelTinta=").append(nivelTinta);
        sb.append('}');
        return sb.toString();
    }
}
