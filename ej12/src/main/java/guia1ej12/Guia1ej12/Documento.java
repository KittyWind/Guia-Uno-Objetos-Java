/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guia1ej12.Guia1ej12;

/**
 *
 * @author kitty
 */
public class Documento {
    private String fecha;
    private String titulo;
    private String contenido;

    public Documento(String fecha, String titulo, String contenido) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int calcularCantCaracteres(){
        return contenido.length() + titulo.length() + fecha.length(); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Documento{");
        sb.append("fecha=").append(fecha);
        sb.append(", titulo=").append(titulo);
        sb.append(", contenido=").append(contenido);
        sb.append('}');
        return sb.toString();
    }


}
