/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej13.Guiaej13;

/**
 *
 * @author kitty
 */
public class Titular {

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private Domicilio domicilio;

    public Titular(String nombre, String apellido, String fechaNacimiento, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titular{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", domicilio=").append(domicilio);
        sb.append('}');
        return sb.toString();
    }
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
